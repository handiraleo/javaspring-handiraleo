import java.util.*;
class BinnarySearch{  
 public static void main(String args[]){  
    int numArray[] = {1, 1, 3, 5, 5, 6, 7}; 
    System.out.println("The input array: " + Arrays.toString(numArray));
   //kunci yang akan dicari
    int key = 3;
    System.out.println("\nX =" + key);
    //set dulu ke indeks pertama
    int first = 0;
    //set elemen terakhir ke elemen terakhir dalam array
    int last=numArray.length-1; 
    //hitung pertengahan array
    int mid = (first + last)/2;  
    //while first and last tidak overlap
    while( first <= last ){  
        //jika tengah <kunci, maka kunci yang akan dicari ada di paruh pertama array
        if ( numArray[mid] < key ){  
            first = mid + 1;     
        }else if ( numArray[mid] == key ){ 
            //jika kunci = elemen di tengah, lalu cetak lokasinya
            System.out.println("Output " + mid);  
            break;  
        }else{  
            //kuncinya akan dicari di paruh kedua array
            last = mid - 1;  
        }  
        mid = (first + last)/2;  
   }  
   //jika pertama dan terakhir overlap, maka kunci tidak ada dalam array
   if ( first > last ){  
      System.out.println("gada");  
   }       
 }  
}  