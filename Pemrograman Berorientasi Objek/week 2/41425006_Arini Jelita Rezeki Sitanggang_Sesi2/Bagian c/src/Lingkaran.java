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

public class Lingkaran {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        // Memasukkan jari-jari
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        // Mengecek apakah jari-jari negatif
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {

            // Menghitung luas dan keliling
            double luas = PI * r * r;
            double keliling = 2 * PI * r;

            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }

        input.close();
    }
}  