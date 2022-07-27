package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        // Ternary operator adalah perbandingan menentukan nilai
        int input, x;
        while (true)
        {
        Scanner InputUser = new Scanner(System.in);

        System.out.print("Masukan Angka : ");
        input = InputUser.nextInt();

        // apabila input diisi 10 maka akan menghitung (input * input)
        // apabila input diisi selain 10 maka akan menghitung (input / 2)
        // SEPERTI CONTOH TERNARY OPERATOR DIBAWAH INI :
        x = (input == 10) ? (input * input) : (input / 2); // Ternary Operator lebih simple

        System.out.println("Hasilnya = " + x + "\n");
        }
    }
}
