package Week01;

public class Hawk extends Bird{

    public Hawk() {
        super(4,120);
        
    }

    public void speak() {
        System.out.println("Screech");
    }

    public void eat() {
        System.out.println("I eat meat!");
    }
    
    public void hunt() {
        System.out.println("I hunt other birds!.");
    }
    public String toString() {
        return "I am a Hawk " + super.toString();
    }
}
