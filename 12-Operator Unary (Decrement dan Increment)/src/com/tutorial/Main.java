package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // Operator Unary adalah Operasi yang dilakukan pada 1 variable saja.

        System.out.println("    Unary '+' dan '-'   ");
        int angka = 1;
        System.out.printf(" Unary '+' = %d menjadi %d\n",angka,+angka);   // Unary Plus
        System.out.printf(" Unary '-' = %d menjadi %d\n\n",angka,-angka); // Unary Minus


        System.out.println(" Unary Increment(-) dan Decrement(+) ");
        // Unary Increment(-)
        int angka1 = 5;
        --angka1; // Preincrement = Dikurangi Terlebih dahulu kemudian Di Tampilkan
        System.out.printf(" Nilai Dari '--a' = %d\n",angka1);

        int b = 5;
        System.out.printf(" Nilai Dari 'a--' = %d\n",b--); // Postincrement = Ditampilkan Terlebih dahulu kemudian Dikurangi

        // Unary Decrement(+)
        int angka2 = 5;
        ++angka2; // Preincrement = Ditambah Terlebih dahulu kemudian Di Tampilkan
        System.out.printf(" Nilai Dari '++b' = %d\n",angka2);

        b++; // Postincrement = Ditampilkan Terlebih dahulu kemudian Ditambah
        System.out.printf(" Nilai Dari 'b++' = %d\n",b);



        // unary boolean dengan ! untuk negasi

        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);











    }
}
