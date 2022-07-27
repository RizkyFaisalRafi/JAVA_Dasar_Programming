package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // Operator Aritmatika akan dilakukan pada nilai desimal
        // Operator Bitwise akan dilakukan pada nilai bit

        // Operator Bitwise adalah operator untuk melakukan operasi pada nilai bit
        // 1 Byte = 8 Bit

        // Menghitung desimal ke binary
        byte a = 3; // Desimalnya 3 ingin dihitung ke nilai binarynya
        byte b, c;
        String a_bits, b_bits, c_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);


        // Operator SHIFT LEFT << (Digeser ke kiri bitnya)
        System.out.println("\n===== SHIFT LEFT");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = (byte) (a << 1); // Casting ke byte // Digeser ke kiri 1 kali
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        // Yang sebelumnya 00000011 Menjadi 00000110 karena digeser ke kiri
        System.out.printf("%s = %d \n", b_bits, b);


        // Operator SHIFT RIGHT >> (Digeser ke kanan bitnya)
        System.out.println("\n===== SHIFT RIGHT");
        a = 6;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = (byte) (a >> 1); // Casting ke byte // Digeser ke kanan 1 kali
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        // Yang sebelumnya 00000110 Menjadi 00000011 karena digeser ke kiri
        System.out.printf("%s = %d \n", b_bits, b);

        // Contoh 2
        System.out.println();
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = (byte) (a >> 2); // Casting ke byte // Digeser ke kanan 2 kali tergantung dari user ingin geser berapa kali
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        // Yang sebelumnya 00011000 Menjadi 00000110 karena digeser ke kiri
        System.out.printf("%s = %d \n", b_bits, b);


        // Operator Bitwise OR |
        System.out.println("\n===== BITWISE OR");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        // Yang sebelumnya 00011000 Menjadi 00000110 karena digeser ke kiri
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("===========================OR");
        c = (byte) (a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits, c);


        // Operator Bitwise AND &
        System.out.println("\n===== BITWISE AND");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        // Yang sebelumnya 00011000 Menjadi 00000110 karena digeser ke kiri
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("===========================AND");
        c = (byte) (a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits, c);


        // Operator Bitwise XOR ^
        System.out.println("\n===== BITWISE XOR");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        // Yang sebelumnya 00011000 Menjadi 00000110 karena digeser ke kiri
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("===========================XOR");
        c = (byte) (a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits, c);
    }
}
