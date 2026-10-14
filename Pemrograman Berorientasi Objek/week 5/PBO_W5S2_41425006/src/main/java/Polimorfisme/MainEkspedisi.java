package Polimorfisme;

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
//Parent Class
class KendaraanEkspedisi {
    public void angkutBarang() {
        System.out.println("Kendaraan ekspedisi sedang mengangkut barang.");
    }
}

//Child Class 1
class Truk extends KendaraanEkspedisi {
    @Override
    public void angkutBarang() {
        System.out.println("Truk mengangkut barang melalui jalur darat.");
    }
}

//Child Class 2
class Kapal extends KendaraanEkspedisi {
    @Override
    public void angkutBarang() {
        System.out.println("Kapal mengangkut barang melalui jalur laut.");
    }
}

//Child Class 3
class Pesawat extends KendaraanEkspedisi {
    @Override
    public void angkutBarang() {
        System.out.println("Pesawat mengangkut barang melalui jalur udara.");
    }
}

//Main Class untuk menjalankan program
public class MainEkspedisi {
    public static void main(String[] args) {
        
        //array bertipe parent class (KendaraanEkspedisi)
        KendaraanEkspedisi[] arinipunya = new KendaraanEkspedisi[3];
        arinipunya[0] = new Truk();
        arinipunya[1] = new Kapal();
        arinipunya[2] = new Pesawat();
        System.out.println("-- Memulai Proses Pengangkutan Barang --");
        
        // Menggunakan SATU for loop untuk iterasi seluruh array. Polimorfisme terjadi di sini (method angkutBarang()), dipanggil melalui referensi parent class tanpa mengecek tipe child-nya
        for (KendaraanEkspedisi kendaraan : arinipunya) {
            kendaraan.angkutBarang(); 
        }
    }
}