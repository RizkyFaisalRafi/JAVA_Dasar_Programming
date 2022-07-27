package com.tutorial;
import java.util.Scanner;
    public class Main
    {
        public static void main(String[] args)
        {
            // Menghitung nilai deret fibonacci ke-n
            int fn1,fn2,fn,n;
            Scanner inputuser = new Scanner(System.in);
            System.out.print("Mengambil nilai fibonacci ke-: ");
            n=inputuser.nextInt();

            fn1 = 0;
            fn2 = 1;
            fn = 1;
            for (int i = 0; i <=n; i++) {
                System.out.println("Nilai ke-" + i + " adalah " + fn);
                // Proses perhitungan fibonacci
                fn = fn1 + fn2; // 1
                fn1 = fn2;      // 2
                fn2 = fn;       // 3

                // Ketiga diatas adalah memori statis

                /* Pembacaan proses
                   fn 1 = 0 fn2 = 1

                        0  +  1
               1. fn = fn1 + fn2;
                  fn = 1

                        1  +  1
               2. fn = fn1 + fn2;
                  fn = 2

                        1  +  2
               3. fn = fn1 + fn2;
                  fn = 3

                */
            }
        }
    }