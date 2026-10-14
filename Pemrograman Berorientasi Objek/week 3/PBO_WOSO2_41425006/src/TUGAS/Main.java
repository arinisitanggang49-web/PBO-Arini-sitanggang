/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Arini
 */
/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

// Class untuk Soal 1 dan Soal 2
class Mahasiswa {
    String nama;
    String nim;
}

// Class untuk Soal 2
class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

// CLASS UTAMA

public class Main {
    public static void main(String[] args) {
        
        //  SOAL 1
        System.out.println(" Output Soal 1 ");
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Budi";
        m1.nim = "12345";

        System.out.println("Nama: " + m1.nama);
        System.out.println("NIM: " + m1.nim);

        System.out.println(); // Jarak spasi

        // SOAL 2
        System.out.println(" Output Soal 2 ");
        MahasiswaAktif m2 = new MahasiswaAktif();
        m2.nama = "Dina";
        m2.nim = "123456";
        m2.semester = 5;

        System.out.println("Nama: " + m2.nama);
        System.out.println("NIM: " + m2.nim);
        m2.belajar();
    }
}
