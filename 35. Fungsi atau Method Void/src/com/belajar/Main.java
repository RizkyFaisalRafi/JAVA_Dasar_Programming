package com.belajar;

public class Main {

    public static void main(String[] args) { // Adalah Fungsi/Method Utama yang dipanggil

        // Void adalah Method Kosong / Void Tipe data kosong
        // Tidak perlu return
        // mENJALANKAN Void method
        fungsiVoid("Rizky Faisal Rafi");
        selamat("Ibu");
        selamat("Bapak");
        selamat("Kakak");
        System.out.println();

        // Menjalankan method dengan kembalian
        System.out.println(simpel());
    }


    // Fungsi / Method tanpa kembalian
    // biasanya digunakan untuk fungsi / method yang tidak melakukan proses perhitungan
    // hanya menampilkan saja / melakukan kegiatan saja / aksi saja tanpa mengambil sebuah nilai
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    private static void selamat(String nama){
        System.out.println("Selamat Pagi " + nama);
    }


    // Ini adalah method dengan kembalian
    // (sehingga menggunakan return untuk mengembalikan nilainya)
    private static float simpel(){
        return 10.8f;
    }

}
