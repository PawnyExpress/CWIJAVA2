import java.util.Arrays;

public class RealWorldLambda {
    public static void main(String[] args) {
        Integer[] numbers = {16, 3, 1000, 42, 656, 23, 1, 13, 63};

        Arrays.sort(numbers, (numberOne, numberTwo) -> numberOne.compareTo(numberTwo));

        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
