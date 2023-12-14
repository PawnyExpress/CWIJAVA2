import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluator {
    
    private Stack<Integer> stack;

    public PostFixEvaluator() {
        this.stack = new Stack<Integer>();
    }

    public int evaluate(String expression) {
        Scanner parser = new Scanner(expression);
        String token;
        int leftOperand, rightOperand, result = 0;
        while(parser.hasNext()) {
            token = parser.next();
            //If token is an operator...
            if (Operator.isOperator(token)) {       
                //Then 
                    //Pop the first two items off the stack
                    rightOperand = stack.pop();
                    leftOperand = stack.pop();
                    //Evaluate the result using the token operator
                    result = Operator.ADD.evaluate(leftOperand, rightOperand);
                    //Push the result on the stack
                    stack.push(result);
            } else { //Otherwise
                    //Parse the String token into an int
                    //Push the int onto the stack
                    stack.push(Integer.parseInt(token));
            }           
        }
        parser.close();
         //return the only item on the stack = The result
        return result;
    }
}
