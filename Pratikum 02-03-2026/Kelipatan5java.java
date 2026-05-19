/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum020326;

/**Program   : kelipatan5.java
 * pembuat   : Muhammad lutvi
 * Tanggal   : 02 maret 2026
 * deskripsi : Menentukan sebuah bilangan merupakan kelipatan 5 atau bukan
 */

import java.util.Scanner;

public class Kelipatan5java {
    public static void main(String[]args){
        int bilangan;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("===Program menentukan kelipatan 5 atau bukan");
        System.out.print("Bilangan = ");
        bilangan = in.nextInt();
        if (bilangan%5==0)
            System.out.println(bilangan +" merupakan bilangan kelipatan 5");
        else
            System.out.println(bilangan +" BUKAN bilangan kelipatan 5");
    }
    
}
