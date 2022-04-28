import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        String word = " ";
        int x = 0;
        int o = 0;

        /* Program */
        // masukan kalimat
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();


        // memanggil prosedur yang mengembalikan nilai int
        x = num_x(word);
        o = num_o(word);

        if (x == o) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }

    private static int num_x(String word) {
        int i;
        int jumlah_x = 0;
        for (i = 0; i < word.length(); i++) {
        if (Character.toLowerCase(word.charAt(i)) == 'x') {
            jumlah_x++;
        }
    }
        return jumlah_x;
}
        private static int num_o(String word) {
            int i;
            int jumlah_o = 0;

            for (i = 0; i < word.length(); i++) {
                if (Character.toLowerCase (word.charAt(i)) == 'o') {
                jumlah_o++;
            }
            } return jumlah_o;
        }
}