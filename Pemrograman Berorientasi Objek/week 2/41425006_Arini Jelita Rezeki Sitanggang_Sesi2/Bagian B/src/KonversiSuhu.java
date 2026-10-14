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

public class KonversiSuhu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 4 / 7) + 32;
        System.out.println(celsius + " C = " + fahrenheit + " F");

        // Input suhu Fahrenheit
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheit2 = input.nextDouble();

        // Mengubah Fahrenheit ke Celsius
        double celsius2 = (fahrenheit2 - 32) * 4 / 7;

        // Menampilkan hasil konversi
        System.out.printf("%.1f F = %.2f C%n", fahrenheit2, celsius2);

        // Menutup Scanner
        input.close();
    }
}

