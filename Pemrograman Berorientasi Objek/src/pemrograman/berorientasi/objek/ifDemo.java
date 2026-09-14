/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemrograman.berorientasi.objek;

/**
 *
 * @author Arini
 */
public class ifDemo {
    public class IfDemo {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
        System.out.println("You are eligible to vote.");
        }
        int age2 = 15;
        if (age2 >= 18) {
        System.out.println("You are eligible to vote.");
        } else {
        System.out.println("You are not eligible to vote.");
        }
        int marks = 75;
        if (marks >= 85) {
        System.out.println("Grade A");
        } else if (marks >= 70) {
        System.out.println("Grade B");
        } else {
        System.out.println("Grade C");
        }
    }
}
}
