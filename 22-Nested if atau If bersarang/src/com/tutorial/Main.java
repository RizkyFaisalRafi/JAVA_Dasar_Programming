package com.tutorial;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("HI");
        // Nested If / If Bersarang
        int a, b;
        a = 5;
        b = 10;

        System.out.println("Nilai A : " + a);
        System.out.println("Nilai B : " + b);

        if (a == 5) // if pertama
        {
            if (b == 10) // if kedua didalam if pertama
            {
                System.out.println("Nilai A dan B Benar");
            }
            else
            {
                    System.out.println("Nilai A Benar, Nilai B Salah");
            }
        }
        else {
            System.out.println("Nilai A dan B Salah");
        }
    }
}

