/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg41425006_arini.jelita.rezeki.sitanggang_sesi2;

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
    }
    
}

//Pertanyaan Pematik :

//Praktek 1: Apa perbedaan nilai asli double dengan hasil casting int?
//Jawab : Nilai asli double dapat memiliki angka desimal, sedangkan casting menjadi int, angka desimalnya dihilangkan.

//Praktek 2: Mengapa pembagian int perlu di-casting ke double?
//Jawab : Karena jika kedua bilangan bertipe int dibagi, hasilnya juga akan dianggap sebagai int, sehingga angka dibelakang koma bisa hilang.

//Praktek 2: Apa risiko jika pembagi = 0?
//Jawab :Jika melakukan pembagian dengan angka 0, operasi pembagian ridak dapat dilakukan. Pada Java, pembagian bilangan int dengan 0 akan menyebabkan error dan program dapat berhenti.