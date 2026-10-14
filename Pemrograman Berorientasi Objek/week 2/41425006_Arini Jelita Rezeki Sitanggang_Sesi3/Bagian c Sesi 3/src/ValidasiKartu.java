/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arini
 */

/*
NIM  : 41425006
Nama : Arini Jelita Rezeki Sitanggang
*/

import java.util.Scanner;

public class ValidasiKartu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String kartu = input.nextLine();

        // Menghapus tanda hubung
        String nomor = kartu.replace("-", "");

        // Cek jumlah digit
        if (nomor.length() != 16) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Nomor kartu harus terdiri dari 16 digit.");

        // Cek apakah semuanya angka
        } else if (!nomor.matches("[0-9]+")) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Nomor kartu hanya boleh berisi angka.");

        // Cek digit pertama
        } else if (!nomor.startsWith("4")
                && !nomor.startsWith("5")
                && !nomor.startsWith("6")) {

            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Harus dimulai dengan 4, 5, atau 6.");

        } else {
            System.out.println("Nomor kartu valid.");
        }

        input.close();
    }
}