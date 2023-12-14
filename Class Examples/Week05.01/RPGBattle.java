import java.util.Random;

public class RPGBattle {
    public static void main(String[] args) {
        int vargusHitPoints = 37;
        System.out.println("Vargus is getting attacked!!");
        try {
            vargusHitPoints = remainingHitPoints(vargusHitPoints);
        } catch (ExceedsHitPointsException exception) {
            System.out.println(exception.getMessage());
            vargusHitPoints = 0;
        }
        System.out.println("Vargus has " + vargusHitPoints + " hp left.");
    }

    private static int remainingHitPoints(int currentHitPoints) {
        Random gen = new Random();
        int damage = gen.nextInt(100) + 1;
        if (damage >= currentHitPoints) {
            throw new ExceedsHitPointsException("Vargus is Dead...");
        }
        return currentHitPoints - damage;
    }
}
