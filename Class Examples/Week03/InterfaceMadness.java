public class InterfaceMadness {
    public static void main(String[] args) {
        Speaker speaker;
        Flyer flyer;

        speaker = new Teacher();
        System.out.println(speaker);
        speaker.speak();

        System.out.println();
        
        flyer = new Airplane();
        System.out.println(flyer);
        flyer.fly();

        System.out.println();

        speaker = new Duck();
        System.out.println(speaker);
        speaker.speak();

        System.out.println();

        flyer = new Duck();
        System.out.println(flyer);
        flyer.fly();
    
    }   
}

