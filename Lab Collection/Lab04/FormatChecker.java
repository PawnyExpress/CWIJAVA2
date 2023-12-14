
import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatChecker{

    //private int rows, columns;
    
    public static void main(String[] args) throws IOException {
        String currentArgs;
        if (args.length < 1) {
            System.out.println("Java FormatChecker");
            System.out.println("Usage: $java FormatChecker file1 [file2...fileN]");
            System.exit(1);
        }  
           try{
            int rows, columns, elements;
            double[][] grid;
            String gridString = "";
            //String line = "";
            //for (String arg: args){
                
            

            File file = new File(args[0]);
            Scanner fileReader = new Scanner(file);
            
            rows = fileReader.nextInt();
            columns = fileReader.nextInt();
            grid = new double[rows][columns];

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    grid[i][j] = fileReader.nextDouble();
                    //gridString += grid[i][j] + "\t";
                    //fileReader.nextDouble();
                }
                //gridString += "\n";
                //fileReader.next();
            }
            //System.out.println(gridString);

            /* for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                System.out.println(grid[i][j] + " ");
            } */
            //System.out.println();
        

            /* while (fileReader.hasNext()) {

                int all = fileReader.nextInt();
                System.out.println(all);
            } */
            fileReader.close();
            //if ()
            System.out.println("Valid");
        
           } catch (FileNotFoundException exception){
            System.out.println("Invalid");
           } catch (InputMismatchException exception) {
            System.out.println("Invalid");
           } catch (IndexOutOfBoundsException exception) {
            System.out.println("Invalid");
           }
        }
        
        
    }
    /* private void ReadDataFile() {
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){


            }
        }
    } */
