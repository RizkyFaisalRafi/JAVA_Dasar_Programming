package com.tutorial;

public class Main {
 /*
 Tipe data Primitive yaitu tipe data yang sudah fiks nilai maks dan minimumnya
 Tipe data primitive adalah tipe data yang hanya mampu menyimpan satu nilai
 tiap satu variabelnya dan defaultnya telah didefinisikan oleh java.
 */
 // Tipe data String bukan termasuk Tipe data Primitive tetapi masuk ke Tipe Data Reference
 // Tipe data reference dalam java digunakan untuk merefrensikan sebuah object, class seperti
 // String, Interface, dan Array.

    public static void main(String[] args) {
	System.out.println("HI FAISAL!!!\n");
	// Tipe data di java : Integer, byte, short, long, float, double, char, boolean.

    // Integer (Satuan, Bilangan Bulat) Di Java Tidak Ada Unsigned
    int i = 1;
    System.out.println("======= INTEGER ======");
    System.out.println("Nilai Integer I   = " + i);
    System.out.println("Nilai Maksimal    = " + Integer.MAX_VALUE);
    System.out.println("Nilai Minimum     = " + Integer.MIN_VALUE);
    System.out.println("Besar Byte Int    = " + Integer.BYTES + " Bytes");
    System.out.println("Besar Bit Int     = " + Integer.SIZE + " Bit\n");

    // Byte (Satuan, Bilangan Bulat)
    byte by = 1;
    System.out.println("======= BYTE ======");
    System.out.println("Nilai Byte by     = " + by);
    System.out.println("Nilai Maksimal    = " + Byte.MAX_VALUE);
    System.out.println("Nilai Minimum     = " + Byte.MIN_VALUE);
    System.out.println("Besar Byte        = " + Byte.BYTES + " Bytes");
    System.out.println("Besar Bit Byte    = " + Byte.SIZE + " Bit\n");

    // Short (Satuan, Bilangan Bulat)
    short s = 1;
    System.out.println("======= SHORT ========");
    System.out.println("Nilai Short S     = " + s);
    System.out.println("Nilai Maksimal    = " + Short.MAX_VALUE);
    System.out.println("Nilai Minimum     = " + Short.MIN_VALUE);
    System.out.println("Besar Byte Short  = " + Short.BYTES + " Bytes");
    System.out.println("Besar Bit Short   = " + Short.SIZE + " Bit\n");

    // Long (Short, Bilangan Bulat)
    long l = 1;
    System.out.println("======= LONG =========");
    System.out.println("Nilai Long L      = " + l);
    System.out.println("Nilai Maksimal    = " + Long.MAX_VALUE);
    System.out.println("Nilai Minimum     = " + Long.MIN_VALUE);
    System.out.println("Besar Byte Long   = " + Long.BYTES + " Bytes");
    System.out.println("Besar Bit Long    = " + Long.SIZE + " Bit\n");

    // Float (Koma , Bilangan Desimal)
    float f = 2.0f;
    System.out.println("======= FLOAT ========");
    System.out.println("Nilai Float F     = " + f);
    System.out.println("Nilai Maksimal    = " + Float.MAX_VALUE);
    System.out.println("Nilai Minimum     = " + Float.MIN_VALUE);
    System.out.println("Besar Byte Float  = " + Float.BYTES + " Bytes");
    System.out.println("Besar Bit Float   = " + Float.SIZE + " Bit\n");

    // Double (Koma , Bilangan Desimal)
    double d = 1.0d;
    System.out.println("======= DOUBLE =======");
    System.out.println("Nilai Double D    = " + d);
    System.out.println("Nilai Maksimal    = " + Double.MAX_VALUE);
    System.out.println("Nilai Minimum     = " + Double.MIN_VALUE);
    System.out.println("Besar Byte Double = " + Double.BYTES + " Bytes");
    System.out.println("Besar Bit Double  = " + Double.SIZE + " Bit\n");

    // Char (Karakter, Berdasarkan ASCII Nilai Maks Minnya)
    char c = 'C';
    System.out.println("===== Character ======");
    System.out.println("Nilai Char C      = " + c);
    System.out.println("Nilai Maksimal    = " + Character.MAX_VALUE); // Berdasarkan ASCII
    System.out.println("Nilai Minimum     = " + Character.MIN_VALUE); // Berdasarkan ASCII
    System.out.println("Besar Byte Char   = " + Character.BYTES + " Bytes");
    System.out.println("Besar Bit Char    = " + Character.SIZE + " Bit\n");

    // Boolean (Hanya Ada True dan False Saja Dan Bernilai Hanya 1 BIT)
    boolean val = false;
    System.out.println("======= BOOLEAN =======");
    System.out.println("Nilai Boolean B   = " + val);
    System.out.println("Nilai Maksimal    = " + Boolean.TRUE); // TRUE
    System.out.println("Nilai Minimum     = " + Boolean.FALSE); // FALSE
    }
}
