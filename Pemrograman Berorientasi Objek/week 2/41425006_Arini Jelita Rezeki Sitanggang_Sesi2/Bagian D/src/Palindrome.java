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
public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // Membalik kata
        String balik = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            balik = balik + kata.charAt(i);
        }
        // Mengecek palindrome
        if (kata.equals(balik)) {
            System.out.println("Kata adalah palindrome");
        } else {
            System.out.println("Kata bukan palindrome");
        }
        // Menghitung huruf vokal
        int vokal = 0;
        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);

            if (huruf == 'a' || huruf == 'i' || huruf == 'u' 
                    ||huruf == 'e' || huruf == 'o') {
                vokal++;
            }
        }
        System.out.println("Jumlah huruf vokal: " + vokal);

        input.close();
    }
}

