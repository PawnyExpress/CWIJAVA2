public class Airplane implements Flyer{

    @Override
    public void fly() {
        System.out.println("Snakes on a Plane!!");
    }
    
    public String toString() {
        return "I am an airplane full of snakes!!!";
    }
}
