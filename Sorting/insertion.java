package Sorting;
import java.util.Scanner;
public class insertion {
    public static void insersionsort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0&&arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
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
        insersionsort(arr);
        pirnt(arr);
        sc.close();
    }
}
