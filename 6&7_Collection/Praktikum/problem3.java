import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(PairSum(List.of(2, 5, 9, 11), 11));
    }

    static List<Integer> PairSum(List<Integer> arr , Integer target){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mapper = new HashMap<>();

        for (int i = 0; i < arr.toArray().length; i++) {

            int sideResult = target - arr.get(i);
            System.out.println(sideResult);

            // if sideResult is exist or not in mapper
            if (mapper.get(sideResult) != null) {
                result.add(mapper.get(sideResult));
                result.add(i);
                System.out.println(result);
                break;
            }
            // fill value of arr in mapper
            mapper.put(arr.get(i), i);
        }

        return result;
    }

}