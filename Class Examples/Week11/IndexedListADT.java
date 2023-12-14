public interface IndexedListADT<E> extends ListADT<E> {
    public void add(int index);

    public E remove(int index);

    public void set(int index, E element);

    public E get(int index);

    public int indexOf(E element);
    
}
