package com.tutorial;

public class Main {

    public static void main(String[] args) /* Method sebelah kiri berhubungan dengan return */
    {
        // BREAK CONTINUE DAN RETURN
        int a = 0;

        while (true) {
            a++;

            if (a == 10) {
                break; // Keyword untuk memaksa keluar dari looping
            }
            else if (a==5) {
                continue; // Keyword untuk memaksa memulai aksi dari awal
            }
            else if (a == 7) {
                return; // Keyword untuk java langsung finish / berakhir
            }
            System.out.println("Bilangan ke-" + a);
        }
        System.out.println("Akhir dari looping");
    }
}
