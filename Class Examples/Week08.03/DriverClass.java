import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        MainClass printer = new MainClass();
        Scanner keyboard = new Scanner(System.in);
        int userInput;

        System.out.println("Enter an integer dividend to calculate: ");
        userInput = keyboard.nextInt();

        printer.doIt(userInput);

        keyboard.close();
    }
}
