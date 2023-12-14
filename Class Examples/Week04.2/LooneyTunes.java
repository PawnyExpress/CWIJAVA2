public class LooneyTunes {
    public static void main(String[] args) {
        IdahoFishAndGame fishAndGame = new IdahoFishAndGame();
        DisplayAttitude[] actors = new DisplayAttitude[3];
        actors[0] = new ElmerFudd(fishAndGame);
        actors[1] = new BugsBunny(fishAndGame);
        actors[2] = new DaffyDuck(fishAndGame);

        

        System.out.println("\n--- Beginning of Skit!");
        for (DisplayAttitude actor : actors) {
            actor.display();System.out.println();
        }

        System.out.println("--- Rabbit Season");
        fishAndGame.setHuntingSeason(HuntingSeason.RABBIT);
        for (DisplayAttitude actor : actors) {
            actor.display();System.out.println();
        }

        System.out.println("--- Duck Season");
        fishAndGame.setHuntingSeason(HuntingSeason.DUCK);
        for (DisplayAttitude actor : actors) {
            actor.display();System.out.println();
        }

        System.out.println("--- Rabbit Season");
        fishAndGame.setHuntingSeason(HuntingSeason.RABBIT);
        for (DisplayAttitude actor : actors) {
            actor.display();System.out.println();
        }

        System.out.println("--- No Season");
        fishAndGame.setHuntingSeason(HuntingSeason.NONE);
        for (DisplayAttitude actor : actors) {
            actor.display();System.out.println();
        }

        System.out.println("!!!Daffy isn't paying attention to the season anymoore...\n");
        ((DaffyDuck)actors[2]).getMeOuttaHere();

        System.out.println("--- Duck Season");
        fishAndGame.setHuntingSeason(HuntingSeason.DUCK);
        for (DisplayAttitude actor : actors) {
            actor.display();System.out.println();
        }
    }
}
