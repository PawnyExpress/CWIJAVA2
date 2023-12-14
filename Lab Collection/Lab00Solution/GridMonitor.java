import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GridMonitor implements GridMonitorInterface{
    private int rows;
    private int columns;
    private double [][] gridData, surroundingSumGrid, surroundingAvgGrid, deltaGrid;
    private boolean [][] dangerGrid;
    private String gridString;
    
    public static void main(String[] args) {
        
    }
    
    public GridMonitor(String fileName) throws FileNotFoundException {
        readDataFile(fileName);
        calculateDataArrays();  
    }

    private void readDataFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        rows = scan.nextInt();
        columns = scan.nextInt();
        gridData = new double[rows][columns];
        surroundingSumGrid = new double[rows][columns];
        surroundingAvgGrid = new double[rows][columns];
        deltaGrid = new double[rows][columns];
        dangerGrid = new boolean[rows][columns];
        gridString = "";

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                gridData[i][j] = scan.nextDouble();
                gridString+= gridData[i][j] + "\t";
            }
            gridString += "\n";
        }
        scan.close();
    }

    private void calculateDataArrays() {
        double lowerRange, upperRange;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if(i == 0) {
                    surroundingSumGrid[i][j] += gridData[i][j];
                } else {
                    surroundingSumGrid[i][j] += gridData[i-1][j];
                }

                if (i == rows-1) {
                    surroundingSumGrid[i][j] += gridData[i][j];
                } else {
                    surroundingSumGrid[i][j] += gridData[i+1][j];
                }

                if(j == columns-1) {
                    surroundingSumGrid[i][j] += gridData[i][j];
                } else {
                    surroundingSumGrid[i][j] += gridData[i][j+1];
                }

                if (j == 0) {
                    surroundingSumGrid[i][j] += gridData[i][j];
                } else {
                    surroundingSumGrid[i][j] += gridData[i][j-1];
                }

                surroundingAvgGrid[i][j] = surroundingSumGrid[i][j] / 4.0;

                deltaGrid[i][j] = Math.abs(surroundingAvgGrid[i][j] / 2.0);

                lowerRange = surroundingAvgGrid[i][j] - deltaGrid[i][j];

                upperRange = surroundingAvgGrid[i][j] + deltaGrid[i][j];

                dangerGrid[i][j] = (gridData[i][j] > upperRange || gridData[i][j] < lowerRange);

                /* if(gridData[i][j] > upperRange || gridData[i][j] < lowerRange) {
                    dangerGrid[i][j] = true;
                } else {
                    dangerGrid[i][j] = false;
                }  */             
            }
        }
    }

    @Override
    public double[][] getBaseGrid() {
        double[][] gridCopy = new double[rows][columns];
        for(int i = 0; i < rows; i++) {
            gridCopy[i] = Arrays.copyOf(gridData[i], columns);           
        }
        return gridCopy;
    }

    @Override
    public double[][] getSurroundingSumGrid() {
        return surroundingSumGrid;
    }

    @Override
    public double[][] getSurroundingAvgGrid() {
        return surroundingAvgGrid;
    }

    @Override
    public double[][] getDeltaGrid() {
        return deltaGrid;
    }

    @Override
    public boolean[][] getDangerGrid() {
        boolean[][] gridCopy = new boolean[rows][columns];
        for(int i = 0; i < rows; i++) {
            gridCopy[i] = Arrays.copyOf(dangerGrid[i], columns);      
        }
        return gridCopy;
    }

    public String toString() {
        return gridString;
    }
    
}