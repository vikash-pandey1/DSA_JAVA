package ArrayList;

import java.util.ArrayList;
//brute force 
public class Pair_sum {
//     public static boolean pairSum (ArrayList<Integer>list,int target){
//         for(int i=0;i<list.size();i++){
//             for(int j=0;j<list.size();j++){
//                 if(list.get(i)+list.get(j)==target){
//                     return true;
//                 }

//             }
//         }
//         return false; 
//     }

                      // this mehtod will work 
// public static boolean pairSum(ArrayList<Integer>list,int target){
//     int lp =0;
//     int rp = list.size()-1;
//     while (lp!=rp) {
//         //case 1
//         if(list.get(lp)+list.get(rp)==target){
//             return true;
//         }
//         //case 2
//         if(list.get(lp)+list.get(rp)<target){
//             lp++;
//         }else{
//             //case 3
//             rp--;
//         }
//     }
//     return false;
// }
public static boolean pairSum(ArrayList<Integer>list,int target){
    int pivit = -1;
    int n = list.size();
    for(int i=0;i<list.size();i++){
        if(list.get(i)>list.get(i+1)){//breaking point
            pivit=i;
            break;
        }
    }
    int lp = pivit+1; // smallest
    int rp = pivit; // largest
    while (lp!=rp) {
        //case 1
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        //case 2
        if(list.get(lp)+list.get(rp)<target){
            lp = (lp+1)%n;
        }else{
            //case 3
            rp = (n+rp-1)%n;
        }
    }
    return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 16;
        System.out.println(pairSum(list, target));
    }
}
