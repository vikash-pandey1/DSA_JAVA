package CP;
public class Lis {
    public  static void lengthLIS(int [] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    count++;
                }
            }
            break;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[] = {10,9,2,5,3,7,101,18};
        lengthLIS(arr);
    }
}
