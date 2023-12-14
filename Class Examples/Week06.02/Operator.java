import java.util.InputMismatchException;

public enum Operator {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');

    private char symbol;

    private Operator(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public int evaluate(int leftOperand, int rightOperand) {
        switch (this) {
            case ADD:
                return leftOperand + rightOperand;
            case SUBTRACT:
                return leftOperand - rightOperand;
            case MULTIPLY:
                return leftOperand * rightOperand;
            case DIVIDE:
                return leftOperand / rightOperand;
            default:
                throw new ArithmeticException("Operator could not be resolved");
        }
    }

    public static boolean isOperator(String token) {
        if (token.length() != 1) { return false; } //Guard statement
        return isOperator(token.charAt(0));
        
    }

    public static boolean isOperator(char token) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol() == token) {
                return true;
            }
        }
        return false;
    }

    public static Operator fromString(String symbol) {
        symbol = symbol.trim();
        if (symbol.length() != 1) { throw new InputMismatchException("Invalid Operator symbol: " + symbol); } // Another guard statement
        return fromCharacter(symbol.charAt(0));
    }

    public static Operator fromCharacter(char symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.getSymbol() == symbol) {
                return operator;
            }
            
        }
        throw new InputMismatchException("Invalid Operator symbol: " + symbol);  // Another guard statement
    }
}
