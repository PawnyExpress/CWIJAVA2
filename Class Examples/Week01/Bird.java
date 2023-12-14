package Week01;

public class Bird {
    private double wingSpan;
    private double flyingSpeed;

    public Bird() {
        this.wingSpan = 2;
        this.flyingSpeed = 25;
    }
    public Bird(double wingSpan, double flyingSpeed) {
        this.wingSpan = wingSpan;
        this.flyingSpeed = flyingSpeed;
    }
    public void eat() {
        System.out.println("I eat tasty food.");

    }

    public void speak() {
        System.out.println("I make sounds.");
    }

    public void fly() {
        System.out.println("I am flying at " + flyingSpeed + " mph with a wingspan of " + wingSpan + " ft.");

    }
    public String toString() {
       return " with a " + this.wingSpan + " ft wingspan and I can fly up to " + this.flyingSpeed + " mph.";
    }
    

}
