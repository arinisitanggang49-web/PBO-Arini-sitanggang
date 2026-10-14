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
import java.util.ArrayList;
import java.util.List;

// Abstract class MantraPerlindungan
abstract class MantraPerlindungan {
    // Method abstrak yang wajib diimplementasikan oleh subclass
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// class konkret Protego
class Protego extends MantraPerlindungan {
    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego menghilang.");
    }
}

// class konkret Fidelius
class Fidelius extends MantraPerlindungan {
    private String secretKeeper; // Menyimpan nama penyihir yang menjadi secret keeper
    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Fidelius aktif. Secret keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Fidelius dinonaktifkan.");
    }
}

// class konkret MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {
    private String area; // Menyimpan area yang dilindungi

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Apparition dilarang di area: " + area);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Apparition diizinkan kembali di area: " + area);
    }
}

// class SistemPertahanan
class SistemPertahanan {
    // Menampung banyak mantra perlindungan menggunakan List
    private List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    // Method untuk menambahkan mantra ke sistem
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
    }

    // Method untuk mengaktifkan semua mantra yang ada
    public void aktifkanSemuaMantra() {
        System.out.println(" Mengaktifkan Semua Pertahanan ");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan(); // Polymorphism ( memanggil method sesuai objek aslinya )
        }
    }

    // Method untuk menonaktifkan semua mantra yang ada
    public void nonaktifkanSemuaMantra() {
        System.out.println(" Menonaktifkan Semua Pertahanan ");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan(); // memanggil method sesuai objek aslinya
        }
    }
}

// Class utama untuk Demonstrasi
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        // Membuat objek SistemPertahanan untuk Hogwarts
        SistemPertahanan hogwarts = new SistemPertahanan();

        // objek mantra perlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Harry Potter");
        MantraPerlindungan antiApparition = new MantraAntiApparition("Hogwarts");

        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        // Demonstrasi mengaktifkan semua mantra
        hogwarts.aktifkanSemuaMantra();
        
        System.out.println(); // Baris kosong untuk pemisah
        // Demonstrasi menonaktifkan semua mantra
        hogwarts.nonaktifkanSemuaMantra();
    }
}