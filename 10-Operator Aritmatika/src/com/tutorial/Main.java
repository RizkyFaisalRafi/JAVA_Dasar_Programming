package com.tutorial;

public class Main {

    public static void main(String[] args) {
        int Variable1 = 10;
        int Variable2 = 5;
        int Hasil;

// Penambahan
    Hasil = Variable1 + Variable2;
    System.out.println(Variable1 + " + " + Variable2 + " = " + Hasil);

// Pengurangan
   Hasil = Variable1 - Variable2;
   System.out.println(Variable1 + " - " + Variable2 + " = " + Hasil);

// Perkalian
    Hasil = Variable1 * Variable2;
    System.out.println(Variable1 + " * " + Variable2 + " = " + Hasil);

// Pembagian
    Hasil = Variable1 / Variable2;
    System.out.println(Variable1 + " / " + Variable2 + " = " + Hasil);

    float Var1 = 10;
    float Var2 = 4;
    float Result = Var1 / Var2;
    System.out.printf("%f / %f = %f \n",Var1,Var2,Result);

// Modulus (Sisa Pembagian)
    Result = Var1 % Var2;
    System.out.printf("%f %% %f = %f \n",Var1,Var2,Result);
    }


}