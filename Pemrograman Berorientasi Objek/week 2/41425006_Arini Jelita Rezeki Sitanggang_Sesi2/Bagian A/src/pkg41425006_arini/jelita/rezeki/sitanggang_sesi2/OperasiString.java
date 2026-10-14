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

public class OperasiString {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nama lengkap: ");
    String nama = input.nextLine();
    
    System.out.println("Panjang string: " + nama.length());
    System.out.println("Huruf pertama: " + nama.charAt(0));
    System.out.println("Mengandung spasi?: " + nama.contains(" "));
}
}

//Pertanyaan Pemantik:

//Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
//Jawab :Jika nama yang diinput memiliki lebih dari satu spasi, semua spasi tersebut akan dianggap sebagai bagian dari String. Akibatnya, panjang nama yang dihitung juga akan ikut bertambah sesuai jumlah spasi yang dimasukkan.