package Recursion;

public class Lastoccurence {
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,34,2,4,24,5,23,5};
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
