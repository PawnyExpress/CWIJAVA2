public class LinearNode<E> {
    
    private LinearNode<E> next;
    private E element;

    public LinearNode() {
        this(null);
    }

    public LinearNode(E element) {
        this.element = element;
        this.next = null;
    }

    public LinearNode<E> getNext() {
        return this.next;
    }

    public void setNext(LinearNode<E> next) {
        this.next = next;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public String toString() {
        return this.element.toString();
    }
}
