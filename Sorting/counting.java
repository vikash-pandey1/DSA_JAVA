package Sorting;

public class counting {
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void countingSort(int arr[]){
        int larg = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            larg = Math.max(larg, arr[i]);
        }
        int count[] = new int[larg+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j] = i;
            j++;
            count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {34,52,6,2,63,3,4,63,34};
        countingSort(arr);
        print(arr);
    }
}
