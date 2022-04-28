import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int primePosition = input.nextInt();
        System.out.println("Output: " + primeX(primePosition));
    }

    private static int primeX(int primePosition) {
        int count = 0;
        int primeIter = 2;
        int primeValue = 0;
        while (count != primePosition) {
            boolean isPrime = true;
            for (int i = 2; i < primeIter; i++) {
                if (primeIter % i == 0) {
                    isPrime = false;
                }
            }
                if (isPrime == true) {
                    primeValue = primeIter;
                    count++;
                }
                primeIter++;
            }
            return primeValue;
        }
    }
