public class Cleric extends SpellCasting{

   /*  protected Cleric(int hitPoints, int armorClass) {
        super(14, 17);
        
    } */

    public Cleric(){
        super(14, 17);
    }

    public void wearArmor(){
        System.out.println("I wear medium armor!");
    }

    public void useWeapon() {
        System.out.println("I kill monsters with simple weapons.");
    }

    public void healsOthers() {
        System.out.println("My friends rely upon my medical skills.");
    }

    public String toString() {
        return "I am a Cleric " + super.toString();
    }
    
}
