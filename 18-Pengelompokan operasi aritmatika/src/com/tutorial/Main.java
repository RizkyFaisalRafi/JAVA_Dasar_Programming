package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Perkalian dan pembagian akan dilakukan terlebih dahulu dibandingkan pertambahan dan pengurangan.
    // Jika dilakukan perkalian dan pembagian maka dilakukan operasi dari kiri ke kanan.
    // Pengelompokan operasi menggunakan () .
        int hasil;
        hasil = 2 + 2 + 5 * 5;
        System.out.println(hasil);

        hasil = (2 + 5) * 5; // Pengelompokan ()
        System.out.println(hasil);

        int result;
        int a, x, b;
        Scanner Input = new Scanner(System.in);

        System.out.print("Nilai A : ");
        a = Input.nextInt();

        System.out.print("Nilai B : ");
        b = Input.nextInt();

        System.out.print("Nilai X : ");
        x = Input.nextInt();

        result = a * x * x + b;

        System.out.println("Hasil : " + result);
    }
}
