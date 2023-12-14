

public class Duck extends WaterFowl implements Speaker, Flyer {
    
    public Duck(){
        super(3, 40);
    }

    public void speak() {
        System.out.println("Quack");
    }

    public String toString() {
        return "I am a duck " + super.toString();
    }
}
