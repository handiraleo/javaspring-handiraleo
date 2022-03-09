import java.util.*;

public class MoneyChange {
    public static void main(String[] args) {
        int money = 432;
        List<Integer> moneychange = Arrays.asList(1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000);
        Collections.sort(moneychange, Collections.reverseOrder());
        List<Integer> hasil = new ArrayList<>();
    
        while(money > 0) {
            for (int i = 0; i < moneychange.size(); i++) {
                while (moneychange.get(i)<=money) {
                    money=money-moneychange.get(i);
                    hasil.add(moneychange.get(i));
                }
            }
        }
        System.out.println(hasil);
    }
}