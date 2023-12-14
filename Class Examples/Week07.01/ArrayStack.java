import java.util.Arrays;

public class ArrayStack<E> implements StackADT<E> {

    private static final int DEFAULT_CAPACITY = 100;

    private E[] stack;
    private int top;

   
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }
    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
    this.top = 0;
        this.stack = (E[])(new Object[initialCapacity]);
    }


    @Override
    public E pop() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        this.top--;
        E result = this.stack[this.top];
        this.stack[this.top] = null;
        return result;
    }

    @Override
    public void push(E element) {
        if (size() == this.stack.length) {
            //expand the capacity
            expandCapacity();
        }
        this.stack[this.top] = element;
        this.top++;
    }

    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        //E result = this.stack[this.top - 1];
        return this.stack[this.top - 1];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return this.top;
    }

    private void expandCapacity() {
        this.stack = Arrays.copyOf(this.stack, this.stack.length * 2);
    }

    public String toString() {
        String result = "";
        for (E item: this.stack) {
            result += "[" + item + "]";
        }
        return result;
    }
    
}
