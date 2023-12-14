public class MainClass {
    private String character;
    private InnerClass calculator;

    public MainClass() {
        this(1, "");
    }

    public MainClass(int factor, String character) {
        this.character = character;
        this.calculator = new InnerClass(factor);
    }

    public void doIt(int dividend) {
        System.out.println(this.calculator.getFormattedCalculatedResult(this.character, dividend));
    }
}
