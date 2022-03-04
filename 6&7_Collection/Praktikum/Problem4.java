import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(task4(List.of(1, 2, 3, 4), List.of(1, 3, 5, 10, 16)));
        System.out.println(task4(List.of(3, 8), List.of(2, 8)));

    }

    public static List<Integer> task4(List<Integer> tempA, List<Integer> tempB) {
        List<Integer> tempat = new ArrayList<>();
        HashMap<Integer, Boolean> arrayA = new HashMap<>();
        for (int v : tempB) { 
            arrayA.put(v, true);
            //System.out.println(arrayA+" bagian atas");
        }
        for (int v : tempA) {
            if (arrayA.get(v) == null) {
                //System.out.println(v+" V isi");
                //System.out.println(arrayA.get(v)+" bagian bawah");
                tempat.add(v);
                //System.out.println(tempat+" tempat");
            }
        }
        return tempat;
    }

}