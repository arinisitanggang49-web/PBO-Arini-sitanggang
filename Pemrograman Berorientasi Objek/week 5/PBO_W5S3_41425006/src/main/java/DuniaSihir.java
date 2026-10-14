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
import java.util.*;
import java.util.ArrayList;
import java.util.List;

// Abstract class MantraSihir
abstract class MantraSihir {
    private String nama;

    public MantraSihir(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

// Subclass ExpelliarmusSihir
class ExpelliarmusSihir extends MantraSihir {
    public ExpelliarmusSihir() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

// Subclass ExpectoPatronumSihir
class ExpectoPatronumSihir extends MantraSihir {
    public ExpectoPatronumSihir() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

// Subclass LumosSihir
class LumosSihir extends MantraSihir {
    public LumosSihir() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Class PenyihirSihir
class PenyihirSihir {
    private String nama;
    private List<MantraSihir> mantraList;

    public PenyihirSihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    // Menambahkan mantra ke daftar mantra
    public void belajarMantra(MantraSihir mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    // Mengucapkan satu mantra tertentu
    public void ucapkanMantra(String namaMantra) {
        for (MantraSihir mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // mengucapkan semua mantra yang sudah dipelajari
    public void ucapkanSemuaMantra() {
        System.out.println(" " + nama + " mengucapkan semua mantra yang dipelajari ");
        if (mantraList.isEmpty()) {
            System.out.println(nama + " belum mempelajari mantra apapun.");
            return;
        }
        for (MantraSihir mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek(); // Polymorphism ( efek menyesuaikan objek aslinya )
        }
        System.out.println(" Selesai ");
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        PenyihirSihir harry = new PenyihirSihir("Harry Potter");
        MantraSihir expelliarmus = new ExpelliarmusSihir();
        MantraSihir expectoPatronum = new ExpectoPatronumSihir();
        MantraSihir lumos = new LumosSihir();
      
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);
        harry.belajarMantra(lumos);
        // Mengucapkan satu per satu (opsional)
        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos");

        // mengucapkan semua mantra sekaligus dalam satu perintah
        harry.ucapkanSemuaMantra();
    }
}
/*
Pertanyaan:
1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
Jawab : Abstract class Mantra jadi kerangka dasarnya, sementara polymorphism muncul lewat list yang bisa menampung berbagai subclass mantra. 
        Saat mantra.efek() dipanggil, Java otomatis memilih efek sesuai objek aslinya. Jadi satu perintah yang sama bisa menghasilkan efek berbeda-beda.
2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah kelas Penyihir? Apakah mudah? Mengapa?
Jawab : Ya, sangat mudah, karena kita cukup membuat class baru yang extends Mantra tanpa perlu menyentuh kelas Penyihir sama sekali. 
        Ini bisa terjadi karena Penyihir hanya bergantung pada tipe abstrak Mantra, bukan pada jenis mantra tertentu.
*/