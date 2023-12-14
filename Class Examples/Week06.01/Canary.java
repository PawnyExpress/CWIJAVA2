public class Canary extends Bird{

    @Override
    public void speak() {
        System.out.println("Tweet tweet tweet");
    }

    @Override
    public void eat() {
        System.out.println("I eat seeds.");
    }

    public void sing() {
        System.out.println("I like to sing as well.");
    }
    
    public String toString() {
        return "I am a canary.";
    }
}
