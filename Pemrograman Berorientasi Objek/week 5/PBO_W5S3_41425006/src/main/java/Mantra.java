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

public class Mantra {
    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload method ucapkan() dengan dua parameter (String, int)
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload method ucapkan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // Overload dengan parameter String dan String
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan " + namaMantra + " ke " + target + ": Efek khusus!");
    }

    // Overload dengan urutan parameter berbeda (int, String)
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        // Memanggil method yang sudah ada
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
        // Memanggil method baru (String, String)
        mantra.ucapkan("Expelliarmus", "Draco");
        // Memanggil method baru (int, String)
        mantra.ucapkan(20, "Expelliarmus");
    }
}

/*
Pertanyaan:
1.Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method dengan dua parameter.
Jawab : Jika method public void ucapkan(String namaMantra, int kekuatan) dihapus, maka kode akan mengalami error saat kompilasi (compile error).
        Karena method dengan dua parameter tersebut sudah dihapus, Java tidak akan menemukan method yang cocok untuk menerima dua argumen tersebut.
2. Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba buat method ucapkan(int kekuatan, String namaMantra).
Jawab : Bisa, karena dalam java method overloading ditentukan oleh signature method, yaitu nama method dan urutan tipe parameternya. 
        Urutan String, int berbeda dengan int, String, sehingga Java menganggapnya sebagai dua method yang berbeda dan tidak akan terjadi konflik.
*/