/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author Arini
 */
// Interface buat saklar (nyala/mati)
interface Switchable {
    void turnOn();
    void turnOff();
}

// Interface ( koneksi WiFi )
interface Connectable {
    void connectToWifi(String ssid, String ipAddress);
}

// Kelas Lampu Pintar
// implements dua interface sekaligus
class SmartLamp implements Switchable, Connectable {
    // Atribut private agar tidak dapat diubah sembarangan
    private int kecerahan;
    private boolean nyala; // menyimpen status nyala/mati

    // Constructor ( menentukan kecerahan )
    public SmartLamp(int kecerahan) {
        this.kecerahan = kecerahan;
        this.nyala = false; // awalnya mati
    }

    // Method ( menyalakan lampu )
    @Override
    public void turnOn() {
        nyala = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + kecerahan + "%");
    }

    // Method ( matikan lampu )
    @Override
    public void turnOff() {
        nyala = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    // Method ( konek WiFi )
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Cek terlebih dahulu, kalau lampu masih mati tidak dapat konek
        if (nyala == false) {
            System.out.println("[Error] Lampu masih mati, gak bisa konek WiFi!");
        } else {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
        }
    }
}

// Kelas AC Pintar
// implements dua interface sekaligus
class SmartAC implements Switchable, Connectable {
    // Atribut private
    private int suhu;
    private boolean nyala; // status nyala/mati

    // Constructor ( menentukan suhu )
    public SmartAC(int suhu) {
        this.suhu = suhu;
        this.nyala = false; // awalnya mati
    }

    // Method ( nyalain AC )
    @Override
    public void turnOn() {
        nyala = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + suhu + " C");
    }

    // Method ( Matikan AC )
    @Override
    public void turnOff() {
        nyala = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    // Method ( konek WiFi )
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Cek dulu, jika masih mati berarti tidak dapat konek 
        if (nyala == false) {
            System.out.println("[Error] AC masih mati, gak bisa konek WiFi!");
        } else {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
        }
    }
}

// Kelas utama untuk menjalankan program
public class SmartHome {
    public static void main(String[] args) {
        // membuat objek lampu dengan kecerahan 85
        SmartLamp lampu = new SmartLamp(85);
        
        // lampu nyala , dapat konek ke wifi
        lampu.turnOn();
        lampu.connectToWifi("Rumah_Indah_5G", "198.163.1.40");

        System.out.println(); // memberi jarak agar lebih terlihat rapii

        // membuat objek AC dengan suhu 18
        SmartAC ac = new SmartAC(18);
        
        // menyalakan AC, konek ke WiFi, setelah itu dimatikan
        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "198.163.1.40");
        ac.turnOff();
    }
}
