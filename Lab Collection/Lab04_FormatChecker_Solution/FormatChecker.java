import java.io.File;
//import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatChecker{
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String fileName : args) {
                System.out.println("\n" + fileName);
                if (isValid(fileName)) {
                    System.out.println("VALID");
                } else {
                    System.out.println("INVALID");
                }
            }
        } else {
            System.out.println("Usage: $java FormatChecker file1 [file2...fileN]");
        }
    }

    private static boolean isValid(String fileName) {
        boolean result = true;
        int rows, cols;
        String fileLine;
        Scanner fileScan = new Scanner(""), stringScan = new Scanner("");
        

        try{
            fileScan = new Scanner(new File(fileName));
            fileLine = fileScan.nextLine();
            stringScan.close();
            stringScan = new Scanner(fileLine);

            try {
                rows = stringScan.nextInt();
                cols = stringScan.nextInt();
            } catch (InputMismatchException exception) {
                throw new InputMismatchException("Grid size values aren't integers.");
            }
            if (stringScan.hasNext()) { //making sure the first line only has two values
                throw new GridMismatchException("Too many values in the first line");
            }

            for (int i = 0; i < rows; i++) {
                if (!fileScan.hasNext()) {
                    throw new GridMismatchException("Too few rows in the table.");
                }
                fileLine = fileScan.nextLine();
                stringScan = new Scanner(fileLine);
                for (int j = 0; j < cols; j++) { //
                    if (!stringScan.hasNext()) {
                        throw new GridMismatchException("Too few columns in the table.");
                    }
                    try {
                        stringScan.nextDouble();
                    } catch (InputMismatchException exception) {
                        throw new InputMismatchException("Grid data value at [" + i + "," + j + "] isn't a double");
                    }
                    
                }
                if (stringScan.hasNext()) {
                    stringScan.close();
                    throw new GridMismatchException("Too many columns in the table.");
                }
            }
            if(fileScan.hasNext()) { //making sure there aren't any more rows
                throw new GridMismatchException("Too many rows in the table.");
            }

        /* } catch (FileNotFoundException exception) {
            System.out.println(exception);
            result = false;
        } catch (InputMismatchException exception) {
            System.out.println(result);
            result = false;
        } catch (GridMismatchException exception) {
            System.out.println(exception);
            result = false;
        */}  catch (Exception exception) {
            System.out.println(exception);
            result = false;
        } finally {
            stringScan.close();
            fileScan.close();
        }
        
        return result;
    }
}