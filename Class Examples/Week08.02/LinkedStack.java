public class LinkedStack<E> implements StackADT<E> {

    private LinearNode<E> top;
    private int count;

    public LinkedStack() {
        this.count = 0;
        this.top = null;
    }

    @Override
    public E pop() {
        E result = peek();
        this.top = this.top.getNext();
        count--;
        return result;
    }

    @Override
    public void push(E element) {
        LinearNode<E> temp = new LinearNode<E>(element);
        temp.setNext(top);
        top = temp;
        temp = null; //Explicit killing of the refrence
        count++;
    }

    @Override
    public E peek() {
        if(this.isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        return this.top.getElement();
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
        LinearNode<E> current = top;
            while(current != null) {
                result += current;
                current = current.getNext();
                    if (current != null) {
                    result += ", ";
                    }
            }
        result += "]";

        return result;
    }
    
}
