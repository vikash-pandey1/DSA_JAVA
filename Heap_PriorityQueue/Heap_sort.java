package Heap_PriorityQueue;

public class Heap_sort {
    public static void heapify(int arr[],int i,int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i;

        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }
    }
    
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,0, i);
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,53,1,32,9,6};
        sort(arr);
        print(arr);
    }
}
