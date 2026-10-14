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

public class SisaBagiPangkat {
    public static void main(String[] args) {
        //Membuat Scanner  untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        //Meminta pengguna memasukan angka pertama
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        
        //Meminta pengguna memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        //Menghitung sisa bagi 
        int sisaBagi = angka1 % angka2;
        
        //Menghitung perpangkatan
        double pangkat = Math.pow(angka1, angka2);
        
        //Menampilkan hasil
        System.out.println("Sisa bagi: " + sisaBagi);
        System.out.println("Pangkat: " + (int) pangkat);
        
        input.close();
    }
}
