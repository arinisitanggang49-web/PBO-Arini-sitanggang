/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arini
 */

/*
NIM : 41425006
Nama : Arini Jelita Rezeki Sitanggang
Motto : if at first you don't succeed, call it version 1.0
*/

package pkg41425006_arini.jelita.rezeki.sitanggang_sesi2;

import java.util.Scanner;

public class DataDiri {

    public static void main(String[] args) {

        // Membuat Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Memasukkan data diri
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean isMahasiswa = input.nextBoolean();

        // Menampilkan data diri
        System.out.println("\n--- DATA DIRI ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        // Casting double menjadi int
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");

        input.close();
    }
}
