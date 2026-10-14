/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjekAnonymous;

/**
 *
 * @author Arini
 */
/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Class sederhana untuk mendemonstrasikan konsep objek anonim
class Button {
    String label; // atribut label pada tombol

    // Constructor untuk menginisialisasi label tombol
    Button(String label) {
        this.label = label;
    }

    // Method yang dijalankan saat tombol diklik
    void click() {
        System.out.println(label + " diklik!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Objek anonim: dibuat langsung, dipakai sekali (memanggil click()),
        // lalu tidak disimpan ke variabel apapun — beda dengan cara biasa
        // yang harus disimpan dulu ke variabel sebelum dipakai
        new Button("Tombol Submit").click();
    }
}