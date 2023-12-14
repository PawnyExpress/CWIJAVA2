public class PintailDuck extends Duck {

    public PintailDuck() {
        super(new Quack(), new FlyWithWings());
    }
    @Override
    public void display() {
        System.out.println("I look like a pintail.");
    }
    
}
