public class Ranger extends Sneaky{

    /* protected Ranger(int hitPoints, int armorClass) {
        super(13, 15);
        
    } */
    public Ranger(){
        super(13, 15);
    }

    public void wearArmor(){
        System.out.println("I wear medium armor!");
    }

    public void useWeapon() {
        System.out.println("I wield martial weapons against monsters.");
    }

    public void willToSurvive() {
        System.out.println("I will survive in the wild!");
    }

    public String toString() {
        return "I am a Ranger " + super.toString();
    }
    
}
