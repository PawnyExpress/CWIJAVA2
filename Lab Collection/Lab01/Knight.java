public class Knight extends Tanks{

    
    public Knight(){
        super(17, 17);
    }

    public void wearArmor(){
        System.out.println("I wear heavy armor!");
    }

    public void useWeapon() {
        System.out.println("I wield martial weapons against monsters.");
    }
    
    public void hasManeuvers() {
        System.out.println("I got some pretty cool fighting moves!");
    }

    public String toString() {
        return "I am a Knight " + super.toString();
    }
}