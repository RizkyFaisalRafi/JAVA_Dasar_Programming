package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("HI");
        int A, B;
        Scanner user = new Scanner(System.in);

        System.out.print("Masukan Nilai A : ");
        A = user.nextInt();
        System.out.print("Masukan Nilai B : ");
        B = user.nextInt();

        // Percabangan If Else If
        if (A == 5)
        {
            System.out.println("Nilai A Benar");
        }
        else if(A < 10) {
            System.out.println("Nilai Kurang Dari 10");
        }
        else {
            System.out.println("Nilai A Salah");
        }
        if (B == 10)
        {
            System.out.println("Nilai B Benar");
        }
        else if(B > 9){
            System.out.println("Nilai Lebih Dari 9");
        }
        else{
            System.out.println("Nilai B Salah");
        }

    }
}
