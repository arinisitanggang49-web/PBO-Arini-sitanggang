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
*/

import java.util.Scanner;

public class DaftarBelanja {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] daftar = new String[20];
        int jumlahItem = 0;
        int pilihan;

        do {
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("\nPilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            // Tambah item
            if (pilihan == 1) {

                System.out.print("Masukkan item: ");
                String item = input.nextLine();
                daftar[jumlahItem] = item;
                jumlahItem++;
                System.out.println(item + " berhasil ditambahkan!");

            // Hapus item
            } else if (pilihan == 2) {
                System.out.print("Hapus item pada posisi: ");
                int posisi = input.nextInt();
                input.nextLine();

                if (posisi >= 1 && posisi <= jumlahItem) {
                    String itemHapus = daftar[posisi - 1];
                    for (int i = posisi - 1; i < jumlahItem - 1; i++) {
                        daftar[i] = daftar[i + 1];
                    }
                    jumlahItem--;
                    System.out.println(itemHapus + " berhasil dihapus!");
                } else {
                    System.out.println("Posisi item tidak ditemukan.");
                }

            // Tampilkan semua item
            } else if (pilihan == 3) {
                System.out.println("Daftar belanja:");
                for (int i = 0; i < jumlahItem; i++) {
                    System.out.println((i + 1) + ". " + daftar[i]);
                }

            // Cari item
            } else if (pilihan == 4) {
                System.out.print("Cari item: ");
                String cari = input.nextLine();
                boolean ditemukan = false;
                for (int i = 0; i < jumlahItem; i++) {
                    if (daftar[i].equalsIgnoreCase(cari)) {
                        System.out.println(
                            daftar[i] + " ditemukan pada posisi " + (i + 1)
                        );
                        ditemukan = true;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Item tidak ditemukan.");
                }

            // Keluar
            } else if (pilihan == 5) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 5);

        input.close();
    }
}