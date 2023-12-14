public class DuckSim {
    public static void main(String[] args) {
        
        Duck[] ducks = new Duck[6];

        ducks[0] = new MallardDuck();
        ducks[1] = new RedheadDuck();
        ducks[2] = new CanvasBackDuck();
        ducks[3] = new RubberDuck();
        ducks[4] = new DecoyDuck();
        ducks[5] = new PintailDuck();

        for (Duck duck : ducks) {
            System.out.println();
            //We deleted the interfaces
           /*  if( duck instanceof Quackable) {
                ((Quackable)duck).quack();
            } */
            duck.performQuack();

            duck.swim();

            /* if(duck instanceof Flyable) {
                ((Flyable)duck).fly();
            } */   
            duck.performFly();;
            duck.display();
        }

        System.out.println("\n\nGag and ground the mallard!");
        ducks[0].setQuackBehavior(new Mute());
        ducks[0].setFlyBehavior(new FlyNoWay());
        System.out.println("Strap a rocket on the Rubber duck!!!");
        ducks[3].setFlyBehavior(new RocketEngine());

         for (Duck duck : ducks) {
            System.out.println();
            duck.performQuack();;
            duck.swim();
            duck.performFly();;
            duck.display();
        }
    }
}