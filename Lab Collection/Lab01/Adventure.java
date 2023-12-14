public class Adventure {
    
    public static void main(String[] args) {
        Knight knight = new Knight();
        Barbarian barbarian = new Barbarian();
        Ranger ranger = new Ranger();
        Rogue rogue = new Rogue();
        Cleric cleric = new Cleric();
        Wizard wizard = new Wizard();

        
        System.out.println(knight);
        knight.wearArmor();
        knight.useWeapon();
        knight.hasManeuvers();

        System.out.println();

        System.out.println(barbarian);
        barbarian.wearArmor();
        barbarian.useWeapon();
        barbarian.tendsToRage();

        System.out.println();

        System.out.println(ranger);
        ranger.wearArmor();
        ranger.useWeapon();
        ranger.sneaksAround();
        ranger.willToSurvive();

        System.out.println();

        System.out.println(rogue);
        rogue.wearArmor();
        rogue.useWeapon();
        rogue.sneaksAround();
        rogue.picksLocks();

        System.out.println();

        System.out.println(cleric);
        cleric.wearArmor();
        cleric.useWeapon();
        cleric.castsSpells();
        cleric.healsOthers();

        System.out.println();

        System.out.println(wizard);
        wizard.useWeapon();
        wizard.castsSpells();
        wizard.solvesProblems();
    }
}
