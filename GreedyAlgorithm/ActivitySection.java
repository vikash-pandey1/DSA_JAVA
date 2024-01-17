package GreedyAlgorithm;
import java.util.*;
public class ActivitySection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,6,9,9};

        // sorting

        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda function -> shortform
        Arrays.sort(activities,Comparator.comparingDouble(o-> o[2]));

        //end time basic sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activiry
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activiry = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("a"+ans.get(i)+" ");

        }
        System.out.println();
    }
}
