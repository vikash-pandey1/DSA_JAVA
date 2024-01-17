package Tree;

import java.util.Arrays;

public class MergeSort {
    public static void mergesort(int [] inputArray){
        int len = inputArray.length;
        if(len<2){
            return;
        }
        int mid = len/2;
        int [] left = new int[mid];
        int [] right = new int[len-mid];
        for(int i=0;i<mid;i++){
            left[i] = inputArray[i];
        }
        for(int i=mid;i<len;i++){
            right[i-mid] = inputArray[i];
        }
        mergesort(left);
        mergesort(right);
        merge(inputArray, left, right);
    }
    public static void merge(int[] mainArray,int [] left,int right[]){
        int l = left.length;
        int r = right.length;
        int i=0;
        int j=0;
        int pos =0;
        while(i<l&& j<r){
            if(left[i]<right[j]){
                mainArray[pos++]=left[i++];
            }else if(left[i]> right[j]){
                mainArray[pos++]= right[j++];
            }
            else{
                mainArray[pos++]=left[i++];
                mainArray[pos++]= right[j++];
            }
        }
        while(i<l){
            mainArray[pos++]=left[i++];
        }
        while(j<r){
            mainArray[pos++]= right[j++];
        }
    }
    public static void main(String[] args) {
        int left[] = {232,25,52,25};
        int right[] = {52,6,3};
        int m[] = new int[left.length+right.length];
        merge(m, left, right);
        System.out.println(Arrays.toString(m));
    }
}