package com.belajar;
import java.util.*;

public class Main {
    static Scanner user = new Scanner(System.in); // Inputan
    public static void main(String[] args) {

        System.out.print("Panjang: ");
        int inputPanjang = user.nextInt();
        System.out.print("Lebar: ");
        int inputLebar = user.nextInt();

        System.out.println("==========================================");
        bintang(inputPanjang,inputLebar);

        tampilkan(inputPanjang, inputLebar);
    }

    private static void bintang(int panjang, int lebar){ // Membuat method gambar bintang menggunakan void tidak mengembalikan
        for (int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static int luas(int panjang, int lebar){ // Membuat method Return perhitungan Luas
//      return panjang * lebar; (Bisa juga seperti ini dinamakan inline variable lebih clean code memperpendek code)

        int hasil = panjang * lebar;
        return hasil;
    }

    private static int keliling(int panjang, int lebar){ // Membuat method Return perhitungan Keliling
//      return (panjang + lebar) * 2; (Bisa juga seperti ini dinamakan inline variable lebih clean code memperpendek code)
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static void tampilkan(int inputPanjang, int inputLebar){
        System.out.println("Luas = " + luas(inputPanjang,inputLebar)); // Memanggil method luas dengajn inputan
        System.out.println("Keliling = " + keliling(inputPanjang, inputLebar)); // Memanggil method keliling dengan inputan
    }
}
