import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GridMonitor implements GridMonitorInterface{

    private int rows;
    private int columns;
    private double[][] gridData;
    private double[][] surroundingSumGrid;
    private double[][] surroundingAvgGrid;
    private double[][] deltaGrid;
    private boolean[][] dangerGrid;
    private String gridString;

    public GridMonitor(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        rows = scan.nextInt();
        columns = scan.nextInt();
        gridData = new double [rows][columns];

        for (int i = 0; i < rows; i++) { //This is my loop for my rows
            for(int j = 0; j < columns; j++) {
                gridData[i][j] = scan.nextDouble();
                //System.out.print("[" + i + "][" + j + "]\t" );
                System.out.print(gridData[i][j] + "\t");  
                
                 

                surroundingAvgGrid = getSurroundingSumGrid();
                deltaGrid = getSurroundingAvgGrid();
                //dangerGrid = getDeltaGrid();                          
            }   
        }
        surroundingSumGrid = getBaseGrid();
        for (int i = 0; i < surroundingSumGrid.length - 1; i++){
            for(int j = 0; j < surroundingSumGrid[i].length; j++){
                double sum = surroundingSumGrid[i -1][j] + surroundingSumGrid[i +1][j] + surroundingSumGrid[i][j - 1] + surroundingSumGrid[i][j+1];
                 surroundingSumGrid[i][j]= sum;
            }
             
        }
       scan.close();  
    }

    public double[][] getBaseGrid() {
        return this.gridData;
        
    }

    @Override
    public double[][] getSurroundingSumGrid() {
        return this.surroundingSumGrid;
    }

    @Override
    public double[][] getSurroundingAvgGrid() {
        return this.surroundingAvgGrid;
    }

    @Override
    public double[][] getDeltaGrid() {
        return this.deltaGrid;
    }

    @Override
    public boolean[][] getDangerGrid() {
       return this.dangerGrid;
    }

    public String toString() {
        
        return "";
    }

}