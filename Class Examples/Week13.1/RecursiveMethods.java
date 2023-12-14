public class RecursiveMethods {
    public static int sum(int number) {
        if (number == 1) {return 1;} // Base case as represented by a "guard"
        return number + sum(number - 1);
    }

    public static int factorial(int number) {
        if (number == 1) {return 1;} // Base case as represented by a "guard"
        return number * factorial( number - 1);
    }
}
