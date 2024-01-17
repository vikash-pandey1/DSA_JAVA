package Array2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    // public static void print(int matrix[][]){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             System.out.print(matrix[i][j]);
    //         }
    //     }
    // }
    static List<Integer> list = new ArrayList<Integer>();
    public static List<Integer> PrintSpiral(int matrix[][]){
        
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while (startRow<=endRow && startCol<=endCol) {
            //top
            for(int j=startCol;j<=endCol;j++){
                // System.out.print(matrix[startRow][j]+" ");
                list.add(matrix[startRow][j]);
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                // System.out.print(matrix[i][endCol]+" ");
                list.add(matrix[i][endCol]);
            }
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                // System.out.print(matrix[endRow][j]+" ");
                list.add(matrix[endRow][j]);
            }
            //
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                // System.out.print(matrix[i][startCol]+" ");
                list.add(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int row = sc.nextInt();
        System.out.println("Enter the size of col");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println("Enter the "+row*col+" element ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        PrintSpiral(matrix);
        for(int a:list){
            System.out.print(a+" ");
        }
        System.out.println();
        //print(matrix);
        sc.close();
    }
}
