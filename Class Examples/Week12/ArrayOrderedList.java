import java.util.NoSuchElementException;

public class ArrayOrderedList<E extends Comparable<E>> implements OrderedListADT<E> {

    private static final int DEFAULT_CAPACITY = 100;
    private static final int NOT_FOUND = -1;

    private E[] list;
    private int front, rear, count;

    public ArrayOrderedList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayOrderedList(int initialcapacity) {
        this.list = (E[])(new Comparable[initialcapacity]);
        front = rear = count = 0;
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
    
}
