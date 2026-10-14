/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author Arini
 */

import id.ac.del.rental.VehicleRental;

public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        // Baris A
        v.plateNumber = "";

        // Baris B
        v.rentalRatePerDay = -500000;

        // Baris C
        v.discountRate = 0.20;

        // Baris D
        v.setRentalDays(-7);

        System.out.println("Total Biaya: Rp" + v.getTotalCost());
    }
}

/*
Silahkan diskusikan bersama kelompok belajar Anda. 
1) Analisis Kompilasi dan Hak Akses (Access Modifiers) 
i) Saat TestRental.java dikompilasi, baris manakah di antara Baris A, B, C, dan D yang akan memicu compile-time error karena perbedaan package? Jelaskan aturan cakupan akses (public, protected, default, dan private) yang menyebabkannya. 
Jawab : Saat TestRental.java dikompilasi, Baris B dan Baris C akan menyebabkan compile-time error karena TestRental dan VehicleRental berada pada package yang berbeda. 
        Baris A tidak menyebabkan error karena plateNumber menggunakan access modifier public, sehingga dapat diakses dari class mana pun. Baris B menyebabkan error karena rentalRatePerDay menggunakan modifier protected. 
        Akses protected dari package yang berbeda tidak dapat dilakukan secara langsung oleh class biasa seperti TestRental. 
        Baris C juga menyebabkan error karena discountRate tidak memiliki access modifier sehingga bersifat default atau package-private dan hanya dapat diakses oleh class yang berada dalam package yang sama. Sementara itu, 
        Baris D tidak menyebabkan compile-time error karena setRentalDays() merupakan method public, sehingga dapat dipanggil dari package berbeda. Atribut private sendiri hanya dapat diakses dari dalam class tempat atribut tersebut didefinisikan. 

2) Kelemahan Integritas Data (Data Hiding & Validation) 
i) Perhatikan Baris A dan Baris D. Walaupun Baris D memanggil metode setter, apa cacat logika yang masih terjadi pada method setRentalDays? 
Jawab : Walaupun Baris D menggunakan method setter, yaitu setRentalDays(-7), masih terdapat cacat logika karena method tersebut tidak melakukan validasi terhadap nilai yang diberikan. 
        Method pada modul hanya berisi this.rentalDays = days;, sehingga nilai negatif seperti -7 tetap diterima dan disimpan ke dalam atribut rentalDays. 
        Seharusnya setter tidak hanya digunakan untuk mengubah nilai, tetapi juga melakukan validasi agar jumlah hari sewa tidak boleh kurang dari nol. Dengan demikian, 
        encapsulation akan lebih baik karena data tidak dapat diubah ke kondisi yang tidak valid melalui method tersebut. 

ii) Nilai total biaya yang dihasilkan bisa bernilai negatif. Mengapa hal ini bisa terjadi dan bagaimana cara merefaktor kelas VehicleRental agar data keuangannya aman dari korupsi data (data corruption)? 
Jawab : Nilai total biaya dapat menjadi negatif karena program menerima rentalDays dengan nilai negatif. Rumus pada getTotalCost() menggunakan perkalian rentalRatePerDay * rentalDays, 
        sehingga apabila jumlah hari bernilai negatif, hasil perhitungannya juga dapat menjadi negatif. Selain itu, rentalRatePerDay dan discountRate pada kode awal masih dapat berpotensi digunakan dengan nilai yang tidak sesuai. 
        Untuk menjaga keamanan data keuangan, class VehicleRental sebaiknya direfaktor dengan menjadikan atribut-atribut penting seperti rentalRatePerDay, rentalDays, dan discountRate sebagai private, kemudian menyediakan setter yang melakukan validasi. 
        Misalnya, rentalRatePerDay harus lebih besar atau sama dengan nol, rentalDays tidak boleh negatif, dan discountRate harus berada pada rentang yang sesuai. Dengan cara tersebut, perubahan data harus melewati method yang memiliki aturan validasi sehingga kemungkinan terjadinya data corruption dapat dikurangi. 
        Modul sendiri mengarahkan analisis pada masalah nilai hari sewa negatif dan keamanan data keuangan tersebut. 

3) Penerapan Interface (Dependency Injection) Jika Sistem ini akan dikembangkan untuk mendukung berbagai skema diskon (misalnya MemberDiscount, FlashSaleDiscount, dan CorporateDiscount): 
i) Rancanglah kontrak interface Discountable yang memiliki metode calculateDiscount(double amount). 
Jawab : Untuk mendukung berbagai skema diskon seperti MemberDiscount, FlashSaleDiscount, dan CorporateDiscount, dapat dibuat interface Discountable sebagai kontrak bersama. 
        Interface tersebut memiliki method calculateDiscount(double amount). Setiap class diskon kemudian dapat mengimplementasikan interface tersebut dengan aturan perhitungan diskonnya masing-masing. 
        Dengan demikian, VehicleRental tidak perlu mengetahui secara langsung jenis diskon yang digunakan. Modul secara khusus meminta interface Discountable dengan method calculateDiscount(double amount). 

        public interface Discountable {

            double calculateDiscount(double amount);
        }

ii) Ubah dan tuliskan ulang kode metode getTotalCost() pada kelas VehicleRental agar menerima parameter bertipe antarmuka Discountable. Supaya perhitungan total biaya dapat langsung mengenali dan memotong harga sesuai dengan objek diskon yang dikirimkan dari kelas TestRental saat runtime (polimorfisme).
Jawab : Method getTotalCost() pada VehicleRental kemudian dapat menerima parameter bertipe Discountable. Contohnya adalah:

        public double getTotalCost(Discountable discount) {

            double subtotal = rentalRatePerDay * rentalDays;
            double potongan = discount.calculateDiscount(subtotal);

        return subtotal - potongan;
        }

        Dengan bentuk ini, VehicleRental tidak bergantung langsung pada MemberDiscount, FlashSaleDiscount, atau CorporateDiscount. Object diskon dapat dikirim dari TestRental saat program dijalankan. 
        Misalnya jika dibuat class MemberDiscount yang mengimplementasikan Discountable, object tersebut dapat diberikan ke getTotalCost(). Method calculateDiscount() yang dijalankan akan mengikuti object yang dikirimkan. 
        Inilah penerapan polymorphism pada runtime dan dependency injection yang diminta pada modul. 

        Contoh penggunaannya:

        Discountable diskon = new MemberDiscount();

            double total = v.getTotalCost(diskon);

        System.out.println("Total Biaya: Rp" + total);

        Jadi kesimpulan Bagian C adalah bahwa access modifier digunakan untuk membatasi akses data, validation digunakan untuk menjaga agar data sewa dan keuangan tetap valid, sedangkan interface Discountable digunakan agar sistem dapat menerima berbagai jenis diskon tanpa harus mengubah logika utama VehicleRental.

*/
