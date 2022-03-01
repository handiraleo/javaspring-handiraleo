import java.beans.IndexedPropertyDescriptor;
import java.util.Scanner;

import javax.print.attribute.standard.MediaName;
import javax.swing.plaf.InputMapUIResource;
import javax.swing.plaf.UIResource;
public class bilprima {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, cek=0;
        
        System.out.println("Program nentuin bilangan prima");
        System.out.print("Masukin Angkanya : ");
        bil=input.nextInt();
   
        System.out.println("hasilnya adalahh");
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            } 
        }
        
        if (cek==1){
            System.out.println(bil+" bilangan prima");
        }else {
            System.out.println(bil+" bukan bilangan prima");
        }  
   }
}

