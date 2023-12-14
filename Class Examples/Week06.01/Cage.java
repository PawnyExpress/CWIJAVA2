public class Cage<T> {
    
    private T occupant;

    public Cage(T occupant) {
        this.occupant = occupant;
    }

    public void swapInCage(T occupant) {
        this.occupant = occupant;
    }

    public T examineCage() {
        return this.occupant;
    }

    public String toString() {
        return this.occupant.toString();
    }
}
