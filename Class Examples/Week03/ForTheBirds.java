

public class ForTheBirds {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Hawk hawk = new Hawk();
        Parrot parrot = new Parrot();
        Goose goose = new Goose();
        HummingBird hummingBird = new HummingBird();

        Bird[] menagerie = new Bird[5];
        menagerie[0] = hawk;
        menagerie[1] = duck;
        menagerie[2] = hummingBird;
        menagerie[3] = parrot;
        menagerie[4] = goose;

        for (Bird bird : menagerie) {
            System.out.println(bird);
            bird.eat();
            bird.fly();
            bird.speak();
            if (bird instanceof Hawk) {
                ((Hawk)bird).hunt();
            }
            if (bird instanceof WaterFowl) {
                ((Duck)bird).swim();
            } 

            System.out.println("");
        }

        /* RubberDuck toy = new RubberDuck();
        System.out.println(toy);
        toy.eat();
        toy.fly();
        toy.speak();
        toy.swim();
        toy.play();
        System.out.println();
        Duck duck = new RubberDuck();
        System.out.println(duck);
        duck.eat();
        duck.fly();
        duck.speak();
        duck.swim();
        //duck.play();
        System.out.println();
        WaterFowl fowl = new RubberDuck();
        System.out.println(fowl);
        fowl.eat();
        fowl.fly();
        fowl.speak();
        fowl.swim();
        System.out.println();
        Bird bird = new RubberDuck();
        System.out.println(bird);
        bird.eat();
        bird.fly();
        bird.speak();
        //bird.swim();
        //bird.play();
        System.out.println();
        Object obj = new RubberDuck();
        System.out.println(obj);
        //obj.eat();
        //obj.fly();
        //obj.speak();
        //obj.swim();
        //obj.play();
        System.out.println(); */
        

        /* System.out.println("\n" + duck );
        duck.eat();
        duck.fly();
        duck.speak();
        duck.swim(); */

    }
}
