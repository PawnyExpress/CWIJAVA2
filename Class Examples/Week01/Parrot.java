package Week01;

public class Parrot extends Bird{
    
    public Parrot() {
        super(4,25);
    }

    public void speak() {
        System.out.println("Polly want a cracker");
    }

    public void eat() {
        System.out.println("I eat crackers!");
    }

    public String toString() {
        return "I am a Parrot " + super.toString();
    }
}
