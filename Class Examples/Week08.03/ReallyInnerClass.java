public class ReallyInnerClass {
    private int divisor;

    public ReallyInnerClass() {
        this(1);
    }

    public ReallyInnerClass(int number) {
        this.divisor = number;
    }

    public int divide(int dividend) {
        return dividend / this.divisor;
    }
}