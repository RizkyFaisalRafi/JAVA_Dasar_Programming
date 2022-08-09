package com.belajar;
import java.util.*;

public class Main {
    static Scanner user = new Scanner(System.in); // Inputan

    // fungsi recursive adalah sebuah fungsi bisa dipanggil berulang ulang seperti halnya looping
    // Recursive function adalah function yang memanggil function dirinya sendiri
    public static void main(String[] args) {

        System.out.print("Masukan Nilai: ");
        int nilai = user.nextInt(); // Inputan

        System.out.println("Anda memasukan nilai = " + nilai);
        printNilai(nilai);

        System.out.println();

        // Menjumlahkan
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah);

        System.out.println();

        // Faktorial
        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil Faktorial = " + faktorial);

    }

    // Fungsi Recursive Sederhana / Selalu ada kondisi untuk Rekursif
    private static void printNilai(int parameter){
        System.out.println("Nilai: " + parameter);

        if(parameter == 0) {
            return; // saat Return akan keluar dari fungsi ini
        }

        parameter--;
        printNilai(parameter);
    }


    // Sebuah fungsi penjumlahan dari semua nilai berurutan
    private static int jumlahNilai (int parameter) {
        System.out.println("Parameter = " + parameter);

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlahNilai(parameter-1);
    }


    // Faktorial
    private static int hitungFaktorial (int parameter) {
        System.out.println("Parameter = " + parameter);

        if (parameter == 1) {
            return parameter;
        }

        return parameter * hitungFaktorial(parameter-1);
    }

}
