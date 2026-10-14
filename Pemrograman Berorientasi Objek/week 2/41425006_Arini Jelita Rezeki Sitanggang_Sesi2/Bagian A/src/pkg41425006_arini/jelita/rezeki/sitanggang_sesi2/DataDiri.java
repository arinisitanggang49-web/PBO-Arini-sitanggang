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

public class DataDiri {
    public static void main(String[] args) {
        String nama = "Andi";
        int umur = 19;
        double tinggi = 165.8;
        boolean isMahasiswa = true;
        
        System.out.println("Nama: " + nama);
        System.out.println("Umur:" + umur + " tahun");
        System.out.println("Tingi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);
        
        
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}
