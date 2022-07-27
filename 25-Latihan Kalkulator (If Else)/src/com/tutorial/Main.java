package com.tutorial;

import java.util.*;

// Latihan Kalkulator (If Else)

public class Main {
    public static void main(String[] args) {
        // a operator b
        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0); // Ambil nilai depan
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input user : " + a + " " + operator + " " + b);

        if (operator == '+') {
            // Penjumlahan
            hasil = a + b;
            System.out.println("Hasil : " + hasil);

        } else if (operator == '-') {
            // Pengurangan
            hasil = a - b;
            System.out.println("Hasil : " + hasil);

        } else if (operator == '*') {
            // Perkalian
            hasil = a * b;
            System.out.println("Hasil : " + hasil);

        } else if (operator == '/') {
            // Pembagian
            if (b == 0) {
                System.out.println("Pembagi 0 menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil : " + hasil);
            }

        } else {
            // Operator tidak ditemukan
            System.out.println("Operator Tidak Ada");
        }
        inputUser.close();
    }
}

