package Recursion;

public class Firstoccurence {
    public static int firstoccurence(int arr[],int i,int key){
        int last;
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            last=i;
            return last;
        }
        return  firstoccurence(arr,i+1,key);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,23,35,3,6,53,3};
        System.out.println(firstoccurence(arr, 0, 3));
    }
}
