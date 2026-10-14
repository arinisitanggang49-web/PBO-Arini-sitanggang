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

// Abstract class sebagai kerangka dasar
abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method ( wajib diimplementasikan oleh subclass )
    public abstract void efek();

    // Method konkret ( bisa langsung diwarisi )
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

// Subclass Expelliarmus
class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

// Subclass ExpectoPatronum
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// TAMBAHAN: Subclass Lumos sesuai instruksi
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        // Polymorphism: tipe MantraAbstrak menampung objek subclass
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos(); // Tambahan Lumos

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        // Memanggil mantra Lumos
        mantra3.ucapkan();
        mantra3.efek();
    }
}

/*
Pertanyaan:
1. Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung? Coba dan jelaskan errornya.
Jawab : kalau kita membuat objek langsung dari abstrak class, maka program akan error saat proses kompilasi (compile-time error). 
        Ini bisa terjadi kareana abstract class ibaratkan kerangka atau konsep dasar yang belum lengkap yang dimana dia punya method yang belum diisi. java melarang membuat objek langsung dari kelas yang belum lengkap. 
        Objek hanya dibuat dari subclass konkret yang sudah mengimolementasikan method.
2. Mengapa kita perlu membuat abstract class? Apa keuntungannya?
Jawab : Abstract class diperlukan sebaagai kerangaka atau kontrak dasar bagi subclassnya. Keuntungannya pertama, memastikan setiap subclass punya struktur yang konsisten karena wajib mengimplementasikan method abstract (seperti efek()). 
        Kedua, menghemat penulisan kode karena method konkret (seperti ucapkan()) bisa langsung diwarisi tanpa perlu ditulis ulang di tiap subclass. Ketiga, mendukung polymorphism, karena kita bisa pakai tipe MantraAbstrak sebagai wadah untuk berbagai objek mantra turunannya, 
        sehingga kode jadi lebih fleksibel dan mudah dikembangkan. 
*/