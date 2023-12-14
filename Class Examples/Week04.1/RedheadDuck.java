public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new Quack(), new FlyWithWings());
    }
    @Override
    public void display() {       
        System.out.println("Looks like a red head duck");
    }

}
