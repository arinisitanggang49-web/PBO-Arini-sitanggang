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

public class Kalkulator { 

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan angka pertama: "); 
        int a = input.nextInt(); 

        System.out.print("Masukkan angka kedua: "); 
        int b = input.nextInt(); 
         
        System.out.println("Tambah: " + (a + b)); 
        System.out.println("Kurang: " + (a - b)); 
        System.out.println("Kali: " + (a * b)); 
        System.out.println("Bagi: " + ((double) a / b)); 
        System.out.println("Modulus: " + (a % b));
        System.out.println("Pangkat: " + Math.pow(a, b));
        
        input.close();
    } 
     
} 