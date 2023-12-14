public interface UnorderedListADT<E> extends ListADT<E> {
    public void addToFront(E element);

    public void addToRear(E element);

    public void addAfter(E element, E target);
}
