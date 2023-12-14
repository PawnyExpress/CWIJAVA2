public interface StackADT<E> {
    
    public E pop();

    public void push(E element);

    public E peek();

    public boolean isEmpty();

    public int size();

    public String toString();
}
