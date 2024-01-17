package Sorting;

public class Shell_sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void shell(int arr[]){
        int n = arr.length;
        for(int gap = n/2;gap>0;gap/=2){
            for(int j = gap;j<n;j++){
                for(int i = j-gap;i>=0;i=i-gap){
                    if(arr[i+gap]>arr[i]){
                        break;
                    }else{
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
                    print(arr);

    }
    public static void main(String[] args) {
        int arr [] = {2,5,53,2,1,03,34,585,21,-1,232};
        shell(arr);
    }
}
