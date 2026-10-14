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

public class SitemLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //User name dan ppassword
        String usernameBenar = "admin";
        String passwordBenar = "password123";
        
        // Maksimal 3 kali percobaan login
        for (int percobaan = 1; percobaan <= 3; percobaan++) {

            System.out.println("=== Sistem Login ===");
            System.out.println("Percobaan " + percobaan + ":");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            
            //Password harus minimal 8 karakter dan mengandung angka
            if (password.length() < 8 || !password.matches(".*\\d.*")) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
            }

            // Mengecek username harus 5-10 karakter
            else if (username.length() < 5 || username.length() > 10) {
                System.out.println("Login gagal! Username harus 5-10 karakter.");
            }

            // Mengecek username dan password
            else if (!username.equals("admin") || !password.equals("password123")) {
                System.out.println("Login gagal! Password salah.");
            }

            // Jika username dan password benar
            else {
                System.out.println("Login berhasil!");
                break;
            }

            // Jika sudah 3 kali percobaan
            if (percobaan == 3) {
                System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
            }

            System.out.println();
        }

        input.close();
    }
}