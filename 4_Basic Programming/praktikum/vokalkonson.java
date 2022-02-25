import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vokalkonson {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan text : ");
            String x = br.readLine();
            
            System.out.println();
            
            int v = 0, c = 0;
            for (int i=0; i<x.length(); i++) {
                if (checkVC(x.charAt(i))==true) {
                    if (getVC(x.charAt(i))==1) 
                        v++;
                    else 
                        c++;
                }
            }
            
            System.out.println("Jumlah huruf vokal : " + v);
            System.out.println("Jumlah huruf konsonan : " + c);
            System.out.println("Total huruf : " + (v+c));
        } 
        catch (IOException ioe) {
            System.out.println("Error IOException : " + ioe.getMessage());
        }
    }
    
    private static boolean checkVC(char text) {
        
        if ((text>=65 && text<=90) || (text>=97 && text<=122)) 
            return true;
        else
           return false;
    } 
    
    private static int getVC(char text) {
        int vc;
        if (text=='A' || text=='E' || text=='I' || text=='O' || text=='U'
                || text=='a' || text=='e' || text=='i' || text=='o' || text=='u')
            vc = 1;
        else
            vc = 0;
        
        return vc;
    }
}