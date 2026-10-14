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

public class GanjilGenap {
    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan habis dibagi 2
        if (bilangan % 2 == 0) {
        System.out.println(bilangan + " adalah bilangan Genap");
        } else {
        System.out.println(bilangan + " adalah bilangan Ganjil");
        }

        // Menutup Scanner
        input.close();
    }
}

