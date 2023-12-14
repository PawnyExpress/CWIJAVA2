import java.util.*;

/**
 * Array-based implementation of IndexedUnsortedList.
 * 
 * @author 
 *
 * @param <E> type to store
 */
public class IUArrayList<E> implements IndexedUnsortedList<E> {
	private static final int DEFAULT_CAPACITY = 10;
	private static final int NOT_FOUND = -1;
	
	private E[] array;
	private int rear;
	
	/** Creates an empty list with default initial capacity */
	public IUArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	/** 
	 * Creates an empty list with the given initial capacity
	 * @param initialCapacity
	 */
	@SuppressWarnings("unchecked")
	public IUArrayList(int initialCapacity) {
		array = (E[])(new Object[initialCapacity]);
		rear = 0;
	}
	
	/** Double the capacity of array */
	private void expandCapacity() {
		array = Arrays.copyOf(array, array.length*2);
	}

	@Override
	public void addToFront(E element) {
		// TODO 
		
	}

	@Override
	public void addToRear(E element) {
		// TODO 
		
	}

	@Override
	public void add(E element) {
		// TODO 
		
	}

	@Override
	public void addAfter(E element, E target) {
		// TODO 
		
	}

	@Override
	public void add(int index, E element) {
		// TODO 
		
	}

	@Override
	public E removeFirst() {
		// TODO 
		return null;
	}

	@Override
	public E removeLast() {
		// TODO 
		return null;
	}

	@Override
	public E remove(E element) {
		int index = indexOf(element);
		if (index == NOT_FOUND) {
			throw new NoSuchElementException();
		}
		
		E retVal = array[index];
		
		rear--;
		//shift elements
		for (int i = index; i < rear; i++) {
			array[i] = array[i+1];
		}
		array[rear] = null;
		
		return retVal;
	}

	@Override
	public E remove(int index) {
		// TODO 
		return null;
	}

	@Override
	public void set(int index, E element) {
		// TODO 
		
	}

	@Override
	public E get(int index) {
		// TODO 
		return null;
	}

	@Override
	public int indexOf(E element) {
		int index = NOT_FOUND;
		
		if (!isEmpty()) {
			int i = 0;
			while (index == NOT_FOUND && i < rear) {
				if (element.equals(array[i])) {
					index = i;
				} else {
					i++;
				}
			}
		}
		
		return index;
	}

	@Override
	public E first() {
		// TODO 
		return null;
	}

	@Override
	public E last() {
		// TODO 
		return null;
	}

	@Override
	public boolean contains(E target) {
		return (indexOf(target) != NOT_FOUND);
	}

	@Override
	public boolean isEmpty() {
		// TODO 
		return false;
	}

	@Override
	public int size() {
		// TODO 
		return 0;
	}


	// IGNORE THE FOLLOWING ITERATOR AND LISTITERATOR IMPLEMENTATION METHODS
	// THESE WILL BE IMPLEMENTED IN A FUTURE LAB
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int startingIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
