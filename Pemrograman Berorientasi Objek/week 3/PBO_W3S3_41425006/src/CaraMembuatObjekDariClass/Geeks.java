/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaraMembuatObjekDariClass;

/**
 *
 * @author Arini
 */
/* 
NAMA  : ARINI JELITA REZEKI SITANGGANG
NIM   : 41425006
PRODI : TEKNOLOGI REKAYASA PERANGKAT LUNAK
*/

class Geeks implements Cloneable {
    @Override //method 1
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();// Super() mengacu ke parent class
    }
    String name = "GeeksForGeeks";

    public static void main(String[] args)// Method 2
    {
        Geeks o1 = new Geeks();

        try {
            Geeks o2 = (Geeks)o1.clone();
            System.out.println(o2.name);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

