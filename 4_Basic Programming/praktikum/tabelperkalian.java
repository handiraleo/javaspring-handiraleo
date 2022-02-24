import java.util.Scanner;

public class tabelperkalian {
 
    public static void main(String[] args) {
        
        System.out.println("\t Tabel Perkalian 1-30 \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukin angkanya : ");
        int input =  sc.nextInt();
 
        for (int i = 1; i <= input; i++) {
 
            for(int j = 1; j <= input; j++){
 
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n\n");
        }
    }
}