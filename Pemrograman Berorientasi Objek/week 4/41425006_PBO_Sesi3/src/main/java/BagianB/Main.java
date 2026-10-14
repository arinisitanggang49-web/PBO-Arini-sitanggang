/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author Arini
 */

// class utama untuk menjalankan program
public class Main {

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // bikin objek StudentGrade
        StudentGrade mhs = new StudentGrade("41425006", "Arini");

        mhs.setNilaiKuis(110.0); // bakal error
        mhs.setNilaiKuis(95.0);  // iniberhasil
        mhs.setNilaiUTS(90.0);   // ini berhasil

        mhs.cetakLaporan();
    }
}
