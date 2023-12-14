public class CanvasBackDuck extends Duck {

    public CanvasBackDuck() {
        super(new Quack(), new FlyWithWings());
    }
    @Override
    public void display() {
        System.out.println("Looks like a canvasback duck");
    }
}
