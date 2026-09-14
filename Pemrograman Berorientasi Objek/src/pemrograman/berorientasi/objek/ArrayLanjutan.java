/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemrograman.berorientasi.objek;

/**
 *
 * @author Arini
 */
public class ArrayLanjutan {
        public static void main(String[] args) {
        int[] anArray = {100, 200, 300, 400};

        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
        System.out.println(anArray[0]); // 100
        System.out.println(anArray[1]); //200
}
