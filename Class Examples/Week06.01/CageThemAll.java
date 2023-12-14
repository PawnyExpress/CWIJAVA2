public class CageThemAll {
    public static void main(String[] args) {  

        Cage<Canary> canaryCage = new Cage<Canary>(new Canary());
        System.out.println("Who's in the canary cage: " + canaryCage);
        canaryCage.examineCage().sing();

        System.out.println();

        Cage<Hawk> hawkCage = new Cage<Hawk>(new Hawk());
        System.out.println("Who's in the hawk cage: " + hawkCage);
        hawkCage.examineCage().hunt();

        System.out.println();

        Cage<Rat> ratCage = new Cage<Rat>(new Rat());
        System.out.println("Who's in the rat cage: " + ratCage);
        ratCage.examineCage().explore();

        System.out.println();

        Cage<Adventurer> dungeonCell = new Cage<Adventurer>(new Adventurer());
        System.out.println("Who's in the dungeon cell: " + dungeonCell);
        dungeonCell.examineCage().goalInLife();

        System.out.println();

        /* hawkCage.swapInCage(canaryCage.examineCage());
        System.out.println("Who's in the hawk cage?"); */

    }
}
