public class ekspo {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));  // 8
        System.out.println(pow(5, 3));  // 125
        System.out.println(pow(10, 2)); // 100
        System.out.println(pow(2, 5)); // 32
        System.out.println(pow(7, 3));  // 343

    }

    public static int pow(int baseNum, int powNum) {
        int result = 1;
        for(int i = 0; i < powNum; i++) {
            result = result * baseNum;
        }
        return result;        
    }
};
