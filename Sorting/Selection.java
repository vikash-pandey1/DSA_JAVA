package Sorting;

import java.util.Scanner;

public class Selection {
    public static void selection(int arr[]){
        // for(int i=0;i<arr.length-1;i++){
        //     int min = i;
        //     for(int j = i+1;j<arr.length;j++){
        //         if(arr[min]>arr[j]){
        //             min=j;
        //         }
        //     }
        //     int temp = arr[min];
        //     arr[min] = arr[i];
        //     arr[i] = temp;
            for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void pirnt(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        selection(arr);
        pirnt(arr);
        sc.close();
    }
}
