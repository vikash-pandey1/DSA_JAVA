package Sorting;

public class Sorting {
    static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,1};
        sort(arr);
    }
}
