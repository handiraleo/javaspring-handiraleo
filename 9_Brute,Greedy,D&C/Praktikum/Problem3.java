import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(dragonWater(new Integer[] { 5, 4}, new Integer[]{7, 8, 4}));
        System.out.println(dragonWater(new Integer[] { 5, 10}, new Integer[]{5}));
        System.out.println(dragonWater(new Integer[] { 7, 2}, new Integer[]{4, 3, 1, 2}));
}
    static String dragonWater(Integer[] dragon, Integer[] knight) {
    List<Integer> dragonList = new ArrayList<Integer>(Arrays.asList(dragon));
    List<Integer> knightList = new ArrayList<Integer>(Arrays.asList(knight));

    int result = 0;
    if(dragonList.size() > knightList.size()) {
        return "knight fall";
    } else if (Collections.max(dragonList) > Collections.max(knightList)) {
        return "knight fall";
    } else {
        Collections.sort(dragonList);
        Collections.sort(knightList);
        for (int i = 0; i < dragonList.size(); i++) {
            for(int j = 0; j < knightList.size(); j++) {
                if(dragonList.get(i) <= knightList.get(j)) {
                    result = result + knightList.get(j);
                    knightList.remove(j);
                    break;
                }
            }
        }
    }
    return Integer.toString(result);
    }
}