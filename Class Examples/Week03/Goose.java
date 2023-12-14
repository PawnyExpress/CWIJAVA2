

public class Goose extends WaterFowl{
    
    public Goose() {
        super(5, 40);
    }

    public void speak() {
        System.out.println("Honk!");
    }

    public String toString() {
        return "I am a Goose " + super.toString();
    } 
    
}
