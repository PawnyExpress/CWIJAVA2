//import java.util.Arrays;

public class CircularArrayQueue<E> implements QueueADT<E>{

    private final static int DEFAULT_CAPACITY = 100;
    private E[] queue;
    private int front, rear, count;

    public CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public CircularArrayQueue(int initialCapacity) {
        queue = (E[])(new Object[initialCapacity]);
        front = rear = count = 0;
    }

    @Override
    public void enqueue(E element) {
        if (size() == queue.length) {
            expandCapacity();
        }
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        count++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }
        E result = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        count--;
        return result;
    }

    @Override
    public E first() {
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return count;
    }

    public String toString() {
        String result = "[";
        int index = front;
        for (int i = 0; i < size(); i++) {
            if (i > 0) {
                result += ", ";
            }
            result += queue[index];
            index = (index + 1) % queue.length;
        }
        result += "]";
        return result;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        //E[] larger = Arrays.copyOf(queue,queue.length * 2);
        E[] larger = (E[]) (new Object[queue.length * 2]);
        for (int i = 0; i < size(); i++) {
            larger[i] = queue[front];
            front = (front + 1) % queue.length;
        }
        front = 0;
        rear = count; 
        queue = larger;
    }
    
}
