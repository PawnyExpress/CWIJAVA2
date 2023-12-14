import java.util.Scanner;

public class AnalyzeMe {

    private static long statementCount;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter sample size...");
        int n = keyboard.nextInt();
        statementCount += 3; // The previous 3 statements: Scanner assignment, println, keyboard assignment.

        statementCount += 2; // Initial declaration and assignment of i and i < n comparison
        for(int i = 0; i < n; i++){       
            innerLoop(n);
            //statementCount++; // previous method call
            statementCount++; // i increment
            statementCount++; // i < n comparison
        }
        

        System.out.println("Sample Size: " + n);
        keyboard.close();
        statementCount += 2; // The previous println and scanner close.
    }

    private static void innerLoop(int n) {
        statementCount += 2; // Declaration and assignment of j and i < n comparison
            for(int j = 0; j < n; j++){
                System.out.println("Processing...");
                statementCount++; // Previous println
                statementCount++; // j increment
                statementCount++; // j < n comparison
            }
    }

    public static long getStatementCount() {
        return statementCount;
    }
}