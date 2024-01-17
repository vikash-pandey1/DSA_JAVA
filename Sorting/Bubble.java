package Sorting;

import java.util.Scanner;

public class Bubble {
    public static void bubblesort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" Element of array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
        print(arr);
        sc.close();
    }
}
