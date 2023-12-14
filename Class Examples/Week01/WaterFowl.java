package Week01;

public class WaterFowl extends Bird {
    
    public WaterFowl(double wingSpan, double flyingSpeed) {
        this.wingSpan = wingSpan;
        this.flyingSpeed = flyingSpeed;
    }

    public void swim() {
        System.out.println("I am swimming");
    }

    
    public void eat() {
        System.out.println("I eat bugs and bread!");
    }
}
