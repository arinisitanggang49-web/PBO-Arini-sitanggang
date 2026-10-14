/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author Arini
 */
public interface IKendaraan {
    void setJlhRoda(int value);
    void setDimensiKendaraan(int value);
    void setJlhSpion(int value);
    void setWarnaKendaraan(String value);
    void cetakInformasi(Object o);
    int getJlhRoda();
    int getDimensiKendaraan();
    int getJlhSpion();
    float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi);
    String getWarnaKendaraan();
}
