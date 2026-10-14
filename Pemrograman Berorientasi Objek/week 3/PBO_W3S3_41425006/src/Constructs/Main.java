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

class Geeks {
    // data members of the class
    String name;
    int id;

    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor
        Geeks geek1 = new Geeks("Sweta", 60);
        System.out.println("GeekName: " + geek1.name
                            + " and GeekId: " + geek1.id);
    }
}
