

public abstract class Bird {
    private double wingSpan;
    private double flyingSpeed;

    
    protected Bird(double wingSpan, double flyingSpeed) {
        this.wingSpan = wingSpan;
        this.flyingSpeed = flyingSpeed;
    }
    
    public abstract void eat(); 

    

    public abstract void speak(); 

    

    public void fly() {
        System.out.println("I am flying at " + flyingSpeed + " mph with a wingspan of " + wingSpan + " ft.");

    }
    public String toString() {
       return " with a " + this.wingSpan + " ft wingspan and I can fly up to " + this.flyingSpeed + " mph.";
    }
    

}
