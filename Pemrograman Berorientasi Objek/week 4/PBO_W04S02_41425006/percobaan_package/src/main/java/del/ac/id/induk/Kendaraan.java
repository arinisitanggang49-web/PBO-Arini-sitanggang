/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author Arini
 */
public class Kendaraan implements IKendaraan
{
    private int jlhRoda, dimensiKendaraan, jlhSpion;
    private String warnaKendaraan;

    public Kendaraan() {

    }

    @Override
    public void setJlhRoda(int value) {
        jlhRoda = value;
    }
    @Override
    public void setDimensiKendaraan(int value) {
        dimensiKendaraan = value;
    }
    @Override
    public void setJlhSpion(int value) {
        jlhSpion = value;
    }
    @Override
    public void setWarnaKendaraan(String value) {
        warnaKendaraan = value;
    }

    @Override
    public void cetakInformasi(Object o) {
        if (o == null) System.out.println("Oject is Null");
    }

    @Override
    public int getJlhRoda() {
        return jlhRoda;
    }

    @Override
    public int getDimensiKendaraan() {
        return dimensiKendaraan;
    }

    @Override
    public int getJlhSpion() {
        return jlhSpion;
    }

    @Override
    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return jlhTorsi * panjangGagang * rasioGigi;
    }
}