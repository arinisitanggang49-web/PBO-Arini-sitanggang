/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructs;

/**
 *
 * @author Arini
 */
/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/
class GetSet {
    private int num;
    // Method 1 - Setter
    public void setNumber(int number)
    {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException();
        }
        num = number;
    }
    // Method 2 - Getter
    public int getNumber() { return num; }
}

class GFG01 {
    public static void main(String[] args)
    {
        GetSet obj = new GetSet();
        obj.setNumber(5);
        System.out.println(obj.getNumber());
    }
}
