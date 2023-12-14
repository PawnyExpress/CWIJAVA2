import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0000");
        int[] list = {7843, 636, 4568, 8765, 6543, 42, 7865, 4532, 9987, 3241, 6589, 6622, 1211, 3};
        String temp;
        int digit, tempDigit, index;

        Queue<Integer>[] digitQueues = (LinkedList<Integer>[])(new LinkedList[10]); 

        for (int i = 0; i < 10; i++) {
            digitQueues[i] = new LinkedList<Integer>();
        }
        for (int position = 0; position < 4; position++) {
            for (int item = 0; item < list.length; item++) {
                temp = format.format(list[item]);
                digit = Character.digit(temp.charAt(3 - position), 10);
                digitQueues[digit].add(list[item]);
            }
            index = 0;
            for (int digitValue = 0; digitValue < digitQueues.length; digitValue++) {
                while (!digitQueues[digitValue].isEmpty()) {
                    tempDigit = digitQueues[digitValue].remove();
                    list[index] = tempDigit;
                    index++;
                }
            }
        }

        for (int item : list) {
            System.out.println(item);
        }
    }
}
