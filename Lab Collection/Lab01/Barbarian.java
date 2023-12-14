public class Barbarian extends Tanks {

    /* protected Barbarian(int hitPoints, int armorClass) {
        super(21, 13);
        
    } */

    public Barbarian(){
        super(21, 13);
    }

    public void wearArmor(){
        System.out.println("I wear medium armor!");
    }

    public void useWeapon() {
        System.out.println("I wield martial weapons against monsters.");
    }

    public void tendsToRage() {
        System.out.println("When I get angry, I fight better!");
    }

    public String toString() {
        return "I am a Barbarian " + super.toString();
    }
    
}
