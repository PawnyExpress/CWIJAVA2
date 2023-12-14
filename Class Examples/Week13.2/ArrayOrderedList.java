import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ArrayOrderedList<E extends Comparable<E>> implements OrderedListADT<E> {

    private static final int DEFAULT_CAPACITY = 100;
    private static final int NOT_FOUND = -1;

    private E[] list;
    private int front, rear, count, modCount;

    public ArrayOrderedList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayOrderedList(int initialcapacity) {
        this.list = (E[])(new Comparable[initialcapacity]);
        front = rear = count = modCount = 0;
    }


    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return removeElement(front);
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return removeElement(decrement(rear));
    }

    @Override
    public E remove(E element) {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return removeElement(find(element));
    }

    @Override
    public E first() {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return this.list[front];
    }

    @Override
    public E last() {
        if (isEmpty()) {
            throw new EmptyCollectionException("ordered list");
        }
        return this.list[decrement(rear)];
    }

    @Override
    public boolean contains(E target) {
        return find(target) != NOT_FOUND;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void add(E element) {
        if (this.size() == this.list.length) {
            expandCapacity();
        }
        // Find insertion location
        int index = front;
        for (int i = 0; i < count && element.compareTo(list[index]) > 0; i++) {
            index = increment(index);
        }
        // Shift existing elements to the right
        int shift = rear;
        while (shift != index) {
            this.list[shift] = this.list[decrement(shift)];
            shift = decrement(shift);
        }
        // Insert the element
        list[index] = element;
        rear = increment(rear);
        count++;
        modCount++;
    }

    public String toString() {
        String result = "";
        int index = front;
        for (int i = 0; i < count; i++) {
            result += this.list[index] + "\n";
            index = increment(index);
        }
        return result;
    }

    private int increment(int index) {
        return (index + 1) % this.list.length;
    }

    private int decrement(int index) {
        return (index - 1) % this.list.length;
    }

    private int find(E element) {
        int index = front;
        for (int i = 0; i < count; i++) {
            if (element.equals(this.list[index])) {
                return index;
            }
            index = increment(index);
        }
        return NOT_FOUND;
    }

    private E removeElement(int index) {
        if (index == NOT_FOUND) {
            throw new NoSuchElementException();
        }
        E result = this.list[index];
        int leftIndex = index, rightIndex = increment(index);
        while (rightIndex < rear) {
            this.list[leftIndex] = this.list[rightIndex];
            leftIndex = increment(leftIndex);
            rightIndex = increment(rightIndex);
        }
        count--;
        modCount++;
        rear = decrement(rear);
        this.list[rear] = null;
        return result;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        E[] larger = (E[]) (new Comparable[list.length * 2]);
        for (int i = 0; i < size(); i++) {
            larger[i] = list[front];
            front = (front + 1) % increment(front);
        }
        front = 0;
        rear = count; 
        list = larger;
    }

    public Iterator<E> iterator() {
        return new ArrayOrderedListIterator();
    }

    private class ArrayOrderedListIterator implements Iterator<E> {
        private int current; // Index of next element to be next'd
        private int virtualIndex; // this represents what the zero-index would be...
        private int iterModCount; // Iterator's snapshot
        private boolean canRemove; // flag to indicate if a remove is valid

        private ArrayOrderedListIterator() {
            current = front;
            virtualIndex = 0;
            iterModCount = modCount;
            canRemove = false;
        }

        @Override
        public boolean hasNext() {
            if ( iterModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return virtualIndex < count;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E item = list[current];
            current = increment(current);
            virtualIndex++;
            canRemove = true;
            return item;
        }

        public void remove() {
            if ( iterModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            if (!canRemove) {
                throw new IllegalStateException();
            }
            // remove the element at index current - 1
            // presumably decrement the rear
            // presumably increment the modCount
            removeElement(decrement(current));
            iterModCount++;
            current = decrement(current);
            virtualIndex = Math.max(virtualIndex - 1, 0);
            canRemove = false;
        }
        
    }

    public ListIterator<E> listIterator() {
        return new ArrayOrderListListIterator();
    }

    public ListIterator<E> listIterator(int nextIndex) {
        return new ArrayOrderListListIterator(nextIndex);
    }

    private class ArrayCursor {
        private int virtualNextIndex;

        public ArrayCursor(int nextIndex) {
            if(nextIndex < 0 || nextIndex > size()) { throw new IndexOutOfBoundsException(); }
            virtualNextIndex = nextIndex;
        }

        public int getVirtualNextIndex() {
            return virtualNextIndex;
        }

        public int getVirtualPreviousIndex() {
            return virtualNextIndex - 1;
        }

        public int getNextIndex() {
            return getActualIndexFromVirtual(getVirtualNextIndex());
        }

        public int getPreviousIndex() {
            return getActualIndexFromVirtual(getVirtualPreviousIndex());
        }

        public void rightShift() {
            if (getVirtualNextIndex() < size()) {
                virtualNextIndex++;
            }  
        }

        public void leftShift() {
            if (getVirtualPreviousIndex() > -1) {
                virtualNextIndex--;
            } 
        }

        private int getActualIndexFromVirtual(int virtualIndex) {
            return (virtualIndex + front) % list.length;
        }
    } 


    private enum ListIteratorState {PREVIOUS, NEXT, NEITHER}

    private class ArrayOrderListListIterator implements ListIterator<E> {

        private ArrayCursor cursor;
        private ListIteratorState state;
        private int listIterModCount;

        public ArrayOrderListListIterator() {
            this(0);
        }

        public ArrayOrderListListIterator(int nextIndex) {
            cursor = new ArrayCursor(nextIndex);
            state = ListIteratorState.NEITHER;
            listIterModCount = modCount;
        }

        @Override
        public boolean hasNext() {
            if (listIterModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return cursor.getVirtualNextIndex() < size();
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E item = list[cursor.getNextIndex()];
            cursor.rightShift();
            state = ListIteratorState.NEXT;
            return item;
        }

        @Override
        public boolean hasPrevious() {
            if (listIterModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return cursor.getVirtualNextIndex() > -1;
        }

        @Override
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            E item = list[cursor.getPreviousIndex()];
            cursor.leftShift();
            state = ListIteratorState.PREVIOUS;
            return item;
        }

        @Override
        public int nextIndex() {
            if (listIterModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return cursor.getVirtualNextIndex();
        }

        @Override
        public int previousIndex() {
            if (listIterModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return cursor.getVirtualPreviousIndex();
        }

        @Override
        public void remove() {
            if (listIterModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            switch (state) {
                case NEXT:
                    removeElement(cursor.getPreviousIndex());
                    cursor.leftShift();
                    break;
                case PREVIOUS:
                    removeElement(cursor.getVirtualNextIndex());
                    cursor.rightShift();
                    break;
                case NEITHER:
                    throw new IllegalStateException();                   
            }
            listIterModCount++;
            state = ListIteratorState.NEITHER;
        }

        @Override
        public void set(E e) {
            throw new UnsupportedOperationException("Unimplemented method 'set'");
        }

        @Override
        public void add(E e) {
            throw new UnsupportedOperationException("Unimplemented method 'add'");
        }
        
    }
}
