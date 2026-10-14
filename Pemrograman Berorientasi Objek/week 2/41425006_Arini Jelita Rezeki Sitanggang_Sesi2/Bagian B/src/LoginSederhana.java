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

public class LoginSederhana {
    public static void main(String[] args) {

        // Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // Meminta username
        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        // Meminta password
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        // Mengecek apakah username benar
        if (!username.equals("admin")) {
            System.out.println("Login gagal! Username tidak valid.");
        }
        // Mengecek apakah password minimal 4 karakter
        else if (password.length() < 4) {
            System.out.println("Login gagal! Password tidak valid.");
        }
        // Mengecek apakah password mengandung angka
        else if (!password.matches(".*\\d.*")) {
            System.out.println("Login gagal! Password tidak valid.");
        }
        // Jika semua validasi terpenuhi
        else {
            System.out.println("Login berhasil!");
        }

        input.close();
    }
}
