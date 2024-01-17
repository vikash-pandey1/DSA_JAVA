package Array2D;

import java.util.Scanner;

public class DiagonalMatrix {
    
    public static int printDiagonal(int matrix[][]){
        int sum =0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){  
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1)
            sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int row = sc.nextInt();
        System.out.println("Enter the size of col");
        int col = sc.nextInt();
        int matrix [][] = new int[row][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(printDiagonal(matrix));
        sc.close();
    }
}
