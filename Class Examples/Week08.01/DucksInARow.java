public class DucksInARow {
    public static void main(String[] args) {
        //Duck front = new Duck("Daffy", "Duck");
        LinearnNode<Duck> front = new LinearnNode<Duck>(new Duck("Daffy", "Duck"));

        /* front.setNext(new Duck("Donald", "Duck"));
        front.getNext().setNext(new Duck("Scrooge", "McDuck"));
        front.getNext().getNext().setNext(new Duck("Darkwing", "Duck"));
        front.getNext().getNext().getNext().setNext(new Duck("Mighty", "Duck")); */
        
        front.setNext(new LinearnNode<Duck>(new Duck("Donald", "Duck")));
        front.getNext().setNext(new LinearnNode<Duck>(new Duck("Scrooge", "McDuck")));
        front.getNext().getNext().setNext(new LinearnNode<Duck>(new Duck("Darkwing", "Duck")));
        front.getNext().getNext().getNext().setNext(new LinearnNode<Duck>(new Duck("Mighty", "Duck")));
        // front -> Daffy -> Donald -> Scrooge -> Darkwing -> Mighty -> null

        // Add Howard to the front of the Collection
        /* Duck temp = new Duck("Mech Suit", "Howard");
        temp.setNext(front);
        front = temp;
        temp = null; */

        LinearnNode<Duck> temp = new LinearnNode<Duck>(new Duck("Mech Suit", "Howard"));
        temp.setNext(front);
        front = temp;
        temp = null;

        // temp -> Mech Suit Howard -> front -> Daffy -> Donald -> Scrooge -> Darkwing -> Mighty -> null

        //Remove Howard from the front of the collection
        //front = front.getNext();

        //System.out.println(front); // Daffy
        //System.out.println(front.getNext()); // Donald
        //System.out.println(front.getNext().getNext()); // Scrooge
        //System.out.println(front.getNext().getNext().getNext()); // Darkwing
        //System.out.println(front.getNext().getNext().getNext().getNext()); // Mighty

        //Duck current = front;
        LinearnNode<Duck> current = front;
        while(current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
