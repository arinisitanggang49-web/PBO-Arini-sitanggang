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

// class untuk menyimpan nilai mahasiswa
public class StudentGrade {

    // Atribut ( dibuat private agar tidak dapat diakses langsung dari luar )
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf; // ini akan diisi otomatis

    // Constructor ( membuat daftar mahasiswa )
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        // memanggil method agar dapat menentukan grade awal
        hitungGradeHuruf();
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }

    // Getter NIM (read only, tidak ada setter)
    public String getNim() {
        return nim;
    }

    // Getter Nama (read only)
    public String getNama() {
        return nama;
    }

    // Getter nilai kuis
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Getter nilai UTS
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Getter grade huruf
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Setter nilai kuis, ada validasi 0-100
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0 - 100)");
        } else {
            this.nilaiKuis = nilaiKuis;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
            hitungGradeHuruf(); // update grade setelah nilai berubah
        }
    }

    // Setter nilai UTS, ada validasi 0-100
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUTS + " (Harus antara 0 - 100)");
        } else {
            this.nilaiUTS = nilaiUTS;
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUTS);
            hitungGradeHuruf(); // update grade setelah nilai berubah
        }
    }

    // Method untuk menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUTS);
    }

    // Method private untuk menentukan grade huruf otomatis
    private void hitungGradeHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85) {
            gradeHuruf = "A";
        } else if (nilaiAkhir >= 75) {
            gradeHuruf = "B";
        } else if (nilaiAkhir >= 65) {
            gradeHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    // Method untuk menampilkan hasil
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
}