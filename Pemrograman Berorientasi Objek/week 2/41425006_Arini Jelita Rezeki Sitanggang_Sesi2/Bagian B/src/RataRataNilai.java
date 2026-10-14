
import java.util.Scanner;

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

public class RataRataNilai {
   
    public static void main(String[] args) {
    //Membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
        double nilai1 = input.nextDouble();
        System.out.print("Masukkan nilai 2: ");
        double nilai2 = input.nextDouble();
        System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();
        
        //Menghitung nilai rataRata
        double rataRata = (nilai1 + nilai2 + nilai3) /3;
        
        //Menampilkan hasil rata-rata
        System.out.printf("Ratarata: %.2f%n", rataRata);
        
        input.close();
        
        
    }
}
