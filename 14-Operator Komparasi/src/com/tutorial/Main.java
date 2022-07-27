package com.tutorial;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Faisal");
        // Komparasi = Perbandingan / Menghasilkan nilai Boolean True atau False
        int a, b;
        boolean Hasil_Komparasi;

        // equal (Persamaan) ==
        a = 5;
        b = 5;
        Hasil_Komparasi = (a == b);
        System.out.println("Nilai a == b = " + Hasil_Komparasi);

        a = 5;
        b = 6;
        Hasil_Komparasi = (a == b);
        System.out.println("Nilai a == b = " + Hasil_Komparasi + "\n");

        // not equal (Pertidaksamaan) !=
        a = 5;
        b = 5;
        Hasil_Komparasi = (a != b);
        System.out.println("Nilai a != b = " + Hasil_Komparasi);

        a = 5;
        b = 6;
        Hasil_Komparasi = (a != b);
        System.out.println("Nilai a != b = " + Hasil_Komparasi + "\n");

        // less than (Kurang Dari) <
        a = 5;
        b = 5;
        Hasil_Komparasi = (a < b);
        System.out.println("Nilai a < b = " + Hasil_Komparasi);

        a = 4;
        b = 5;
        Hasil_Komparasi = (a < b);
        System.out.println("Nilai a < b = " + Hasil_Komparasi + "\n");

        // greater than (Lebih Dari) >
        a = 5;
        b = 5;
        Hasil_Komparasi = (a > b);
        System.out.println("Nilai a > b = " + Hasil_Komparasi);

        a = 6;
        b = 5;
        Hasil_Komparasi = (a > b);
        System.out.println("Nilai a > b = " + Hasil_Komparasi + "\n");


        // Less Than Equal (Kurang Dari Sama Dengan) <=
        a = 5;
        b = 5;
        Hasil_Komparasi = (a <= b);
        System.out.println("Nilai a <= b = " + Hasil_Komparasi);

        a = 6;
        b = 5;
        Hasil_Komparasi = (a <= b);
        System.out.println("Nilai a <= b = " + Hasil_Komparasi + "\n");

        //Greater Than Equal (Lebih Dari Sama Dengan) >=
        a = 5;
        b = 5;
        Hasil_Komparasi = (a >= b);
        System.out.println("Nilai a >= b = " + Hasil_Komparasi);

        a = 5;
        b = 4;
        Hasil_Komparasi = (a >= b);
        System.out.println("Nilai a >= b = " + Hasil_Komparasi + "\n");

    }
}
