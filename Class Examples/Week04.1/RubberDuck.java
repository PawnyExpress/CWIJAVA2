public class RubberDuck extends Duck{

    public RubberDuck() {
        super(new Squeak(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Looks like a rubber duck.");
    }



    public void swim() {
        System.out.println("Float and bob on the water.");
    }


    
}
