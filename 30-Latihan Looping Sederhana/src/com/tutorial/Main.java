package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner inputUser = new Scanner(System.in);
    int nilaiAwal, nilaiAkhir, total;
        System.out.print("Masukan Nilai Awal : ");
        nilaiAwal = inputUser.nextInt();

        System.out.print("Masukan Nilai Akhir : ");
        nilaiAkhir=inputUser.nextInt();


        total = 0;
//    while (nilaiAwal <= nilaiAkhir) {
//        total = total + nilaiAwal;
//        System.out.println("Ditambah " + nilaiAwal + " Menjadi " + total);
//        nilaiAwal++;
//    }

//        for (;nilaiAwal <= nilaiAkhir; nilaiAwal++) {
//            total = total + nilaiAwal;
//            System.out.println("Ditambah " + nilaiAwal + " Menjadi " + total);
//        }

        do {
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " Menjadi " + total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);

    }
}
