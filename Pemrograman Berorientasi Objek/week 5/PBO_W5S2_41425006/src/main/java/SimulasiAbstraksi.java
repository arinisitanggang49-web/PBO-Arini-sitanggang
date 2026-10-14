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
// Mendeklarasi class abstrak. class ini ga bisa buat objek secara langsung
abstract class KendaraanEkspedisi {
    // Ini variabel, ini dapat diakses oleh class turunannya
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor untuk menginisialisasi atribut dari kendaraan
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Method konkret. Ini dapat langsung digunakan oleh class anak
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Method abstrak
    public abstract void angkutBarang(String namaBarang);
}

// Class konkret ini yang mewarisi KendaraanEkspedisi
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi dari method abstrak angkutBarang
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang +
                           "' ke dalam kontainer tertutup pendingin.");
    }
}

// Class konkret
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi dari method abstrak angkutBarang dengan perilaku berbeda
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                           "' di bagasi belakang untuk distribusi kota.");
    }
}
// Eksperimen 2
class MotorKurir extends KendaraanEkspedisi {
}

// Class utama
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("----------------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}

/*
Lembar Analisis Abstraksi:
1. Error: KendaraanEkspedisi is abstract; cannot be instantiated
   Java membatalkan baris tersebut karena KendaraanEkspedisi adalah kelas abstrak, yang berarti objek tidak bisa dibuat secara langsung
   menggunakan new. Kelas abstrak hanya berfungsi sebagai kelas dasar yang akan diwarisi oleh kelas-kelas berikutnya. Di samping itu, KendaraanEkspedisi
   memiliki metode abstrak angkutBarang() yang belum memiliki isi, sehingga kelas tersebut belum dapat dibuat menjadi objek.

2. Dua opsi solusi/perbaikan yang ditawarkan oleh IDE adalah:
  - Implement all abstract methods : menambahkan implementasi method angkutBarang() ke dalam class MotorKurir.
  - Make MotorKurir abstract : menjadikan class MotorKurir sebagai abstract class sehingga tidak wajib mengimplementasikan method angkutBarang().
*/
