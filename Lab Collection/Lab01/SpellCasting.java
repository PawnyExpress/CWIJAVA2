public abstract class SpellCasting extends Character {

    protected SpellCasting(int hitPoints, int armorClass) {
        super(hitPoints, armorClass);
       
    }

/*     public abstract void wearArmor();

    public abstract void useWeapon(); */
    
    public void castsSpells() {
        System.out.println("My real power is in my spells!");
    }
}
