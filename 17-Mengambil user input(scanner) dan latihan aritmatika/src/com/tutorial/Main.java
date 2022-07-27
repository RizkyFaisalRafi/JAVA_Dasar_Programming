package com.tutorial;
import java.util.Scanner;

public class Main {
        // Membuat perhitungan menghitung luas dengan mengambil input dari user
    public static void main(String[] args) {
        int panjang, lebar, luas, volume, tinggi;
        // Scanner = classnya
        // userInput = object milik Scanner
        // new Scanner = membuat class baru scanner

        // (System.in) = memasukan angka/huruf ke hasil sesuai setting bawahnya int / double / char
        Scanner userInput = new Scanner(System.in);

        // int input = membuat variable input dengan tipe data int
        // userInput = memanggil objek dengan fungsinya userInput yang sudah dibuat diatas
        // .nextInt = agar bisa memasukan sekaligus 2 angka dan hasilnya langsung 2, agar tidak usah
        // mengetikan 2 kali, bisa juga mengetikan 2 kali terserah pengguna.

        // int input = userInput.nextInt();
        // System.out.println("Input 1 = " + input);

       // int input2 = userInput.nextInt();
       // System.out.println("Input 2 = " + input2);
        System.out.println("Menghitung Luas");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("Menghitung Volume");
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);

    }
}
