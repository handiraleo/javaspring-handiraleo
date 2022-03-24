public class Romawi {

    public static void main(String[] args) {
        // buat ngetest input sm outputnya 
        angkaNormalkeRomawi(4);
        angkaNormalkeRomawi(9);
        angkaNormalkeRomawi(23);
        angkaNormalkeRomawi(2021);
        angkaNormalkeRomawi(1646);
    }

    public static void angkaNormalkeRomawi(int angkaNormal) {
        // print input biasa yg diminta di googledocs
        System.out.println("Input: " + angkaNormal);

        // array buat ngakses kalo angka normalnya berapa, maka indeks angka romawinya berapa
        int[] valueAngkaNormal = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] valueRomawi = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        // String buat nampung hasil konversinya
        String hasilKonversi = "";


        // forloop buat ngunjungin angka normalnya, dikurangin, trs update string
        // hasilKonversi gitu terus sampe i-nya lebih dari valueAngkaNormal
        for(int i=0;i<valueAngkaNormal.length;i++) {
            while(angkaNormal >= valueAngkaNormal[i]) {
                angkaNormal -= valueAngkaNormal[i];
                hasilKonversi += valueRomawi[i];
            }
        }
        // ngeprint outputnyaa
        System.out.println("Output: " + hasilKonversi + "\n");
    }
}
