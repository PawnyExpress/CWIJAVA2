package Week01;

public class ForTheBirds {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Hawk hawk = new Hawk();
        Parrot parrot = new Parrot();
        Goose goose = new Goose();

        System.out.println(hawk);
        hawk.eat();
        hawk.fly();
        hawk.speak();
        hawk.hunt();

        System.out.println("\n" + duck );
        duck.eat();
        duck.fly();
        duck.speak();
        duck.swim();

        System.out.println("\n" + parrot);
        parrot.eat();
        parrot.fly();
        parrot.speak();

        System.out.println("\n" + goose);
        goose.eat();
        goose.fly();
        goose.speak();
        goose.swim();
    }
}
