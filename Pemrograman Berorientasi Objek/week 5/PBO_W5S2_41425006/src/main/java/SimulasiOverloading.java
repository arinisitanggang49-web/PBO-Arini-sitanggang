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
// mendeklarasikan class bernama MesinTarif
class MesinTarif {
    // Variabel instance untuk menyimpan nama kota asal
    private String kotaAsal;
    
    // Constructor untuk menginisialisasi nilai kotaAsal ketika objek dibuat
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }
    
    /* Menghitung ongkir hanya berdasarkan berat */
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    /* menghitung ongkir berdasarkan berat dan nilai barang */
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01; // Menghitung 1% dari nilai barang
        return (beratKg * 10000) + biayaAsuransi;
    }

    /* menghitung ongkir berdasarkan berat dan status ekspedisi*/
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000; // Tarif dasar
        if (isExpress) { // Jika bernilai true (express)
            total += 20000; // Tambahkan biaya express
        }
        return total;
    }
}

public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");
        
        System.out.println("=== INI METHOD OVERLOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg)  : Rp " + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("Ongkir Express (2.0 Kg): Rp " + tarif.hitungOngkir(2.0, true));
    }
}

/*
Lembar Analisis Overloading:
1. Compiler Java mampu menentukan metode hitungOngkir yang akan dipanggil sebelum eksekusi program dimulai karena Java menerapkan pengetikan yang statis. 
   Pemindaian kode memeriksa tanda tangan metode, yaitu nama metode disertai dengan daftar parameter (jumlah, urutan, dan jenis data). 
   Tipe data dari hasil kembalian tidak digunakan untuk membedakan antara metode yang ada. Oleh karena itu, ketika kode dituliskan, sistem dapat segera mengetahui metode yang sesuai berdasarkan argumen yang disediakan.
2. Compiler menolak kode tersebut karena dalam Java, penentuan sebuah metode hanya dilihat dari nama metode dan daftar parameternya (jumlah, urutan, dan tipe). 
   Tipe data yang dikembalikan, baik itu int maupun double, tidak menjadi faktor penentu. Jika ada dua metode dengan nama identik dan daftar parameter yang sama, meskipun tipe data hasil kembalinya berbeda, 
   Java tetap memandangnya sebagai satu metode yang sama. Sebenarnya, Java tidak memperbolehkan adanya dua metode yang sama dalam satu class. Karena itu, kode tersebut ditolak oleh compiler.
*/