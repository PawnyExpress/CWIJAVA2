public abstract class Character {
    private int hitPoints;
    private int armorClass;

    protected Character(int hitPoints, int armorClass) {
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
    }

    public void wearArmor(){
        System.out.println("I wear ");
    }

    public void useWeapon(){
        System.out.println("I wield ");
    }

    public String toString() {
        return  "\nI have " + this.hitPoints + " HPs and " + this.armorClass + " AC" ;
    }
}
