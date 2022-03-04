import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(AngkaMunculSekali("76523752"));
    }

    static List<Integer> AngkaMunculSekali(String angka) {
        HashMap<String, Integer> angkaMap = new HashMap<>();
        List<Integer> angkaResult = new ArrayList<>();
        List<String> angkaList = new ArrayList<String>(Arrays.asList(angka.split("")));
        System.out.println(angkaList);

        for (var v: angkaList) {
            angkaMap.put(v, (angkaMap.get(v) == null? 0:angkaMap.get(v))  +1);
            System.out.println(angkaMap);
        }
        for (var v: angkaMap.keySet()) {
            if (angkaMap.get(v) == 1) {
                angkaResult.add(Integer.parseInt(v));
                System.out.println(angkaResult);
            }
        }
        return angkaResult;
    }

}