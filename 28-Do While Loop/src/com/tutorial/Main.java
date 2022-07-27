package com.tutorial;

public class Main {

    public static void main(String[] args) {
//        do {
//            Aksi
//        } while (Kondisi);

    int a = 0;
    boolean kondisi = true;
    do {
        a++;
        System.out.println(a);
        if (a == 10) { // Pemberhentiannya
            kondisi = false;
        }
    } while (kondisi);

    }
}
