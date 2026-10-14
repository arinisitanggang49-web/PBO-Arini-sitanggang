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

public class KonventerWaktu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");
        pilihan = input.nextInt();
        input.nextLine();
        
        if(pilihan == 1) {
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = input.nextInt();
            int jam = totalDetik / 3600;
            int menit = (totalDetik % 3600) / 60;
            int detik = totalDetik % 60;

            System.out.printf("Hasil: %02d:%02d:%02d%n", jam, menit, detik);

        } else if (pilihan == 2) {

            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = input.nextLine();

            String[] bagian = waktu.split(":");

            int jam = Integer.parseInt(bagian[0]);
            int menit = Integer.parseInt(bagian[1]);
            int detik = Integer.parseInt(bagian[2]);
            int totalDetik = (jam * 3600) + (menit * 60) + detik;

            System.out.println("Hasil: " + totalDetik + " detik");

        } else {

            System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}
