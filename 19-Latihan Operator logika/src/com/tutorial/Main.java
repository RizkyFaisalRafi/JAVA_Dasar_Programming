package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Membuat sebuah objek untuk menangkap dari user
        Scanner user = new Scanner(System.in);

        int nilaiTebakan;
        int nilaiBenar = 6;
        boolean statusTebakan;

        System.out.print("Masukan Nilai Tebakan : ");
        nilaiTebakan = user.nextInt();
        System.out.println("Jawaban Kamu : " + nilaiTebakan);

        // Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Hasil Tebakan Kamu : " + statusTebakan);
        System.out.println("Jawaban Yang Benar Adalah : " + nilaiBenar);

        // Operasi Aljabar Boolean (and / or)
        // AND &&
        System.out.print("Masukan Nilai Tebakan : ");
        nilaiTebakan = user.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Hasil Tebakan : " + statusTebakan);

/*
               AND
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
*/


    }
}
