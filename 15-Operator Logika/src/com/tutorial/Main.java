package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Operator Logika (and, or, xor, not/Negasi)
    boolean a,b,c;
        // AND / &&
        System.out.println("===== Operator AND && =====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + "\t&&\t" + b + "\t= " + c);

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + "\t&&\t" + b + "\t= " + c);

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + "\t&&\t" + b + "\t= " + c);

        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + "\t&&\t" + b + "\t= " + c + "\n");


        // OR / ||
        System.out.println("===== Operator OR || =====");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + "\t||\t" + b + "\t= " + c);

        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + "\t||\t" + b + "\t= " + c);

        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + "\t||\t" + b + "\t= " + c);

        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + "\t||\t" + b + "\t= " + c + "\n");

        // Exlusive OR XOR / ^
        System.out.println("===== Operator XOR ^ =====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + "\tXOR\t" + b + "\t= " + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + "\t^\t" + b + "\t= " + c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + "\t^\t" + b + "\t= " + c);

        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + "\t^\t" + b + "\t= " + c + "\n");


        // Negasi / Not / !
        System.out.println("===== Operator NOT ! =====");
        a = true;
        System.out.println("Nilai " + a + " Menjadi " + !a);
    }
}
