package com.tutorial;
public class Main {

    public static void main(String[] args) {
//      for (inisialisasi; kondisi; StepNilai)
//    	for (int a = 0; a <= 10; a++) // Explisit yaitu menjabarkan semuanya
//    	{
//            Statement / Pernyataan
//      }

        System.out.println("FOR Pertama");
        for (int a = 0; a <=10; a++)
        {
            System.out.println("Data ke-" + a);
        }

        System.out.println("\nFOR Kedua");
        for (int a = 0; a <10; a++)
        {
            System.out.println("Data ke-" + a);
        }

        System.out.println("\nFOR Ketiga");
        for (int angka = 10; angka >=1; angka--)
        {
            System.out.println("Data ke-" + angka);
        }

        System.out.println("\nFOR Ke Empat");
        int a = 0;
        for (; a <=10; a++)
        {
            System.out.println("Data ke-" + a);
        }

	}
}
