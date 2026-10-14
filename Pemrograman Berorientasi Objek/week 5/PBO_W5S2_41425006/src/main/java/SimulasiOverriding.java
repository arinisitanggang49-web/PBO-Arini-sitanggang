/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Arini
 */
// Class induk (Superclass) yang mendefinisikan kurir reguler
class KurirReguler {
    // Variabel protected biar bisa diakses oleh class anak
    protected String nama;

    // Constructor untuk menginisialisasi nama kurir
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method umum untuk mengirim barang (ini ditimpa oleh class anak)
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kecamatan.");
    }
}

// class anak (subclass) yang mewarisi sifat KurirReguler menggunakan keyword extends
class KurirDrone extends KurirReguler {
    // variabel tambahan khusus untuk class KurirDrone
    private String idDrone;

    // constructor KurirDrone yang memanggil constructor induk menggunakan super
    public KurirDrone(String nama, String idDrone) {
        super(nama); // Memanggil constructor KurirReguler untuk mengisi nama
        this.idDrone = idDrone; // Mengisi variabel khusus drone
    }

    // ini menimpa method dari class induk
    @Override
    public void kirimBarang(String alamat) {
        // Implementasi baru yang spesifik untuk pengiriman via drone
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                           " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

// Class utama untuk menjalankan simulasi
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");
        // Membuat objek KurirReguler biasa
        KurirReguler k1 = new KurirReguler("Budi");
        /* membuat objek KurirDrone, tipe variabelnya adalah KurirReguler.ini Polymorphism, disaat method dipanggil, ia akan menggunakan versi milik KurirDrone */
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");
        // memanggil method kirimBarang milik objek k1 (reguler)
        k1.kirimBarang("J1. Sudirman No. 10");
        // memanggil method kirimBarang milik objek k2 (versi drone, karena overriding)
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

/*
Lembar Analisis Overriding:
1. Jika baris @Override dihapus atau diberi komentar, lalu nama metode diubah menjadi public void kirimbarang(String alamat) dengan huruf 'b' kecil,
   maka metode tersebut tidak akan menggantikan metode kirimBarang dari kelas induk. Java sensitif terhadap huruf besar dan kecil, sehingga kirimbarang dan kirimBarang dipandang sebagai dua metode yang terpisah. 
   Sebagai hasilnya, metode kirimbarang dalam kelas KurirDrone hanya akan dianggap sebagai metode baru, bukan sebagai penggantian.
2. Objek k2 memiliki tipe KurirReguler, namun diisi dengan objek dari KurirDrone. Ketika method kirimBarang diaktifkan, 
   Java akan mencari method itu di dalam class KurirReguler karena tipe variabelnya adalah KurirReguler. 
   Method kirimBarang yang baru ditambahkan di KurirDrone tidak menggantikan method kirimBarang yang terdapat pada KurirReguler. Jadi, yang dijalankan adalah method kirimBarang dari KurirReguler.
   Output yang tercetak : Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kecamatan.
3. Jika @Override diletakkan di atas metode kirimBarang (huruf 'B' besar), maka proses kompilasi tidak akan berhasil. 
   Compiler akan memberikan pesan kesalahan karena @Override menunjukkan bahwa metode yang ada di bawahnya seharusnya menggantikan metode dari superclass. 
   Namun, di superclass tidak terdapat metode dengan nama kirimBarang yang menggunakan huruf 'B' besar.
   Pesan error  : error: method does not override or implement a method from a supertype
    @Override
    ^
4. Tulisan @Override berperan sebagai tanda bagi compiler bahwa metode yang terdapat di bawahnya dimaksudkan untuk menggantikan metode dari kelas induk. 
   Dengan adanya tanda ini, pengembang dapat menghindari kesalahan seperti pengetikan nama metode yang keliru atau penulisan parameter yang salah. 
   Apabila terjadi kesalahan, compiler akan segera memberikan peringatan atau kesalahan, sehingga bug dapat terdeteksi lebih awal. 
   Selain itu, @Override juga membuat kode menjadi lebih jelas karena menjelaskan bahwa metode tersebut adalah hasil dari penggantian, bukan metode yang baru.
*/