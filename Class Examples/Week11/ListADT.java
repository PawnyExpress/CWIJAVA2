public interface ListADT<E> extends Iterable<E>{
    
    public E removeFirst();
    public E removeLast();
    public E remove(E element);
    public E first();
    public E last();
    public boolean contains(E target);
    public boolean isEmpty();
    public int size();
    public String toString();
}
