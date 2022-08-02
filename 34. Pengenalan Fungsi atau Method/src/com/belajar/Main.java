package com.belajar;

public class Main {



    public static void main(String[] args) { // Adalah Fungsi/Method Utama yang dipanggil
        System.out.println("Assalamualikum");

        int y, x;
        x = 10;
        y = hitung(x); // Menggunakan Fungsi hitung

        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x); // Menggunakan Fungsi hitung
        System.out.println("x = " + x + ", y = " + y);

        x = 40;
        y = (x + 2) * x; // Tidak menggunakan fungsi
        System.out.println("x = " + x + ", y = " + y);

        // Hitung Luas Menggunakan Fungsi / Method
        System.out.println("\nHitung Luas Menggunakan Fungsi / Method");
        int p, l;
        p = 10;
        l = 10;
        y = luas(p, l);
        System.out.println("Luas Dari Panjang " + p + ", Lebar " + l + " = " + y);
    }

    private static int hitung(int input) {
        int hasil;
        hasil = (input + 2) * input;
        return hasil;
    }

    private static int luas(int panjang, int lebar){
        int result;
        result = panjang * lebar;
        return result;
    }
}
