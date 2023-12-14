public class Wizard extends SpellCasting{

    /* protected Wizard(int hitPoints, int armorClass) {
        super(9, 10);
       
    } */
    public Wizard(){
        super(9, 10);
    }

    public void useWeapon() {
        System.out.println("I can hit monsters with my staff.");
    }
    
    public void solvesProblems() {
        System.out.println("I am the best problem solver in the party!");
    }

   
    public void wearArmor() {
    }

    public String toString() {
        return "I am a Wizard " + super.toString();
    }
}
