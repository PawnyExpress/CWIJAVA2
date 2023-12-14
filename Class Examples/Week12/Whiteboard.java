import java.util.ArrayList;
import java.util.Iterator;



public class Whiteboard {
    public static void main(String[] args) {
        ArrayList<String> myBookList = new ArrayList<String>();
        myBookList.add("Jurassic Park");
        myBookList.add("Tale of Two Cities");
        myBookList.add("The Lord of the Rings");
        myBookList.add("Timeline");

        // Syntactic Sugar
        /* for (String book : myBookList) {
            System.out.println(book);
        } */
        // Is actually doing
        Iterator<String> itr = myBookList.iterator();
        while (itr.hasNext()) {
            String book = itr.next();
            myBookList.add("Congo");
            System.out.println(book); // body of the for-each loop
        }
    }
}
