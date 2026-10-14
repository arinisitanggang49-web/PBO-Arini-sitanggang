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

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        double total = harga * jumlah;

        if (total >= 900000) {
            double diskon = total * 10 / 100;
            total = total - diskon;

            System.out.println("Nama barang: " + namaBarang);
            System.out.println("Total belanja: " + (harga * jumlah));
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: " + total);
        } else {
            System.out.println("Nama barang: " + namaBarang);
            System.out.println("Total belanja: " + total);
            System.out.println("Diskon: 0");
            System.out.println("Total bayar: " + total);
        }

        input.close();
    }
}

