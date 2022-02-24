import java.util.Scanner;

public class palindrome{
public static void main(String[] args) {

Scanner in = new Scanner(System.in);

String Original, reverse = "";
Original = in.nextLine();

int length = Original.length();

for(int i = length -1; i >=0; i--)
reverse = reverse + Original.charAt(i);

if(Original.equals(reverse))
System.out.println("palindrom");
else
System.out.println("bukan palindrom");

in.close();
}

}