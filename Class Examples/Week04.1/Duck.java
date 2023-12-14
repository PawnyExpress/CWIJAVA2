public abstract class Duck {
    
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    protected Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void swim() {
        System.out.println("Float and paddle on the water.");
    }

    /* public void quack(){
        System.out.println("Quack, quack, quack");
    }
    
    public void fly(){
        System.out.println("Flap, flap, flap through the air.");
    } */

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}
