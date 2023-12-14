public class DecoyDuck extends Duck{

    public DecoyDuck() {
        super(new Mute(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("looks like a decoy duck.");
    }

    public void swim() {
        System.out.println("Float and bob on the water.");
    }

}
