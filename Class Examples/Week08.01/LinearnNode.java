public class LinearnNode<E> {
    
    private LinearnNode<E> next;
    private E element;

    public LinearnNode() {
        this(null);
    }

    public LinearnNode(E element) {
        this.element = element;
        this.next = null;
    }

    public LinearnNode<E> getNext() {
        return this.next;
    }

    public void setNext(LinearnNode<E> next) {
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
