public class CageForHawk {
    private Hawk occupant;

    public CageForHawk(Hawk occupant) {
        this.occupant = occupant;
    }

    public void swapInCage(Hawk occupant) {
        this.occupant = occupant;
    }

    public Hawk examineCage() {
        return occupant;
    }

    public String toString() {
        return this.occupant.toString();
    }
}
