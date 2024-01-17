import java.util.HashMap;
import java.util.Map;

public class CountArrayElement{
    public static void main(String[] args) {
        int[] numbers = {-3,0,1,-3,1,1,1,-3,10,0};

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Element Counts: " + countMap);
    }
}

