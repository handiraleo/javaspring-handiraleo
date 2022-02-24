import java.util.Scanner;

public class eksponentation {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("X:");

        int A=input.nextInt();

        System.out.print("N:");

        int B=input.nextInt();

        int Hasil=(int) Math.pow(A, B);

        System.out.println("Output:"+Hasil);

    }   

}