import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int tinggi = input.nextInt();

        for (int i=1; i<=tinggi; i++){
            for (int space = 1; space <= tinggi - i; space++){
                System.out.print(" ");
            }

            for (int bintang = 1; bintang <= i * 2 - 1; bintang++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}