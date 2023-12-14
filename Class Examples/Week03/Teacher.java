public class Teacher implements Speaker {

    @Override
    public void speak() {
        System.out.println("Java!!!");
    }
    
    public String toString() {
        return "I am teacher! Coffee!!";
    }
}
