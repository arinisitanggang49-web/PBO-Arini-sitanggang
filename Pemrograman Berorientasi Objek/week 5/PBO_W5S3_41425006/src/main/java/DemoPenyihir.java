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

// Superclass Penyihir
class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Subclass HarryPotter
class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Subclass Hermione
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// Subclass RonWeasley (TAMBAHAN sesuai instruksi)
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan ragu tapi berani.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        // Polymorphism ( tipe Penyihir menampung objek subclass )
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley(); // Tambahan Ron

        penyihir1.ucapkanMantra(); 
        penyihir2.ucapkanMantra(); 
        penyihir3.ucapkanMantra(); 
    }
}

/*
Pertanyaan:
1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih berjalan?
Jawab : Kode masih berjalan dengan lancar, karena @override hanyalah sebiah annotation ( penanda metadata) yang bersifat opsional. 
        Yang dimana fungsinya hanya untuk memberitahu compiler bahwa method yang kita tulis subclass ini sengaja dimasukkan untuk menimpa (override) method dari superclass.
2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
Jawab : Keuntungan menggunakan polymorphism adalah kita cukup hanya memakai satu tipe referensi (penyihir) untuk menampung objek yang berbeda-beda, dan saat methodnya dipanggil, hasilnya otomatis menyesuaikan objek aslinya. 
        Selain itu, kode jauh lebih mudah dan fleksibel dan rapi, karena kalau kita mau nambah karakter baru, kita cukup buat class barunya tanpa mengubah kode yang sudah ada di dalam main. 
*/
