package Array2D;

import java.util.Scanner;

public class first {
    public static void print(int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean search(int matrix[][],int key){
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static int largest(int matrix[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int r = sc.nextInt();
        System.out.println("Enter the size of column");
        int c = sc.nextInt();
        System.out.println("Enter your search element");
        int search = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
       
        print(matrix);
        search(matrix, search);
        //largest(matrix);
        System.out.println("largest no is "+largest(matrix));
        sc.close();
    }
}
