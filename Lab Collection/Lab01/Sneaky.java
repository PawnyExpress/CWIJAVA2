public abstract class Sneaky extends Character{

    protected Sneaky(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
        
    }

     public void sneaksAround() {
        System.out.println("I am very sneaky!");
    }

    /* public void wearArmor() {
        System.out.println("I wear "); 
    }

    public void useWeapon() {
        System.out.println("I wield ");
    } */
    
}
