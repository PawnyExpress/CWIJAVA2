public class Rogue extends Sneaky{

    /* protected Rogue(int hitPoints, int armorClass) {
        super(11, 16);
        
    } */

    public Rogue(){
        super(11, 16);
    }

    public void wearArmor(){
        System.out.println("I wear light armor!");
    }
    
    public void useWeapon() {
        System.out.println("I kill monsters with simple weapons.");
    }

    public void picksLocks() {
        System.out.println("Picking locks is my specialty!");
    }

    public String toString() {
        return "I am a Rogue " + super.toString();
    }
}
