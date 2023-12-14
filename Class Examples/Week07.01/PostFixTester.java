import java.util.Scanner;

/**
 * This is the application class that allows us to enter postfix expressions and evaluate the result
 * @author dgarcia
  */
public class PostFixTester {

    /**
     * This is the starting point of the postfix evaluator app
     * @param args these are the command line arguments which aren't used in this application
      */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PostFixEvaluator evaluator = new PostFixEvaluator();
        String expression;
        int result;

        System.out.println("Enter a valid post-fix expression one token at a time with a space between each token");
        expression = keyboard.nextLine();

        result = evaluator.evaluate(expression);

        System.out.println("\nThat expression equals: " + result);

        keyboard.close();
    }
}