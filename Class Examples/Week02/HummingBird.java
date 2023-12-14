public class HummingBird extends Bird {
    
    public HummingBird() {
        super(0.2, 61);
    }

    public String toString() {
        return "I am a hummingbird" + super.toString();
    }

    @Override
    public void eat() {
        System.out.println("I eat Nectar"); 
    }

    @Override
    public void speak() {
        System.out.println("Pffffft.....");
    }
}
