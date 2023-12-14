import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws FileNotFoundException{
        int numerator, denominator, result;
        String[] names = {"Bilbo", "Frodo", "Samwise"};
        //FileInputStream input = new FileInputStream("");

        FileOutputStream output = new FileOutputStream("errors.txt", true);
        PrintStream printOutput = new PrintStream(output);
        System.setErr(printOutput);

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a numerator value: ");
            numerator = scan.nextInt();

            System.out.println("Enter a denominator value: ");
            denominator = scan.nextInt();

            result = numerator/denominator;

            System.out.println("the result is: " + result);

            displayTheName(names, result);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("Hey that index is invalid.");
            System.out.println("I'm giving you Gandalf!");
        } catch(InputMismatchException exception) {
            System.err.println("Did that really look like a number to you?");
            //result = 0;
        } catch (ArithmeticException exception) {
            System.err.println("Why are you dividing by Zero?");
            //result = 0;
        } catch (Exception exception) {
            System.err.println("I handle everything!");
            //result = 0;
        } finally {
            scan.close();
            System.out.println("Hope you run my application again :)");
        }
        
        

    }

    private static void displayTheName(String[] names, int index) {
        //try {
            System.out.println("The name I choose is: " + names[index]);
        /* } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Hey that index is invalid.");
            System.out.println("I'm giving you Gandalf!");
        } */
        
    }
}