/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum30032006;

/**
 *
 * @author LAB-SI-PC
 *

import java.util.Scanner;
public class mainpersegipanjang{
    public static void main(String[] args) {
        mainpersegipanjang pp1 = new mainpersegipanjang();
        pp1.panjang =20;
        pp1.lebar = 10;
        int luas = pp1.hitungLuas();
        System.out.println("Objek persegi panjang pertama");
        System.out.println("Panjang  = "+pp1.panjang);
        System.out.println("Lebar    = "+pp1.lebar);
        System.out.println("Luas     = "+luas);
        System.out.println("Keliling = "+pp1.hitungKeliling());
        
        //membuat objek kedua konstruktor dua
        Persegipanjang pp2 = new Persegipanjang(10,5);
        luas = pp2.hitungLuas();
        System.out.println("Objek persegi panjang pertama");
        System.out.println("Panjang  = "+pp2.panjang);
        System.out.println("Lebar    = "+pp2.lebar);
        System.out.println("Luas     = "+luas);
        System.out.println("Keliling = "+pp2.hitungKeliling());
       
        //membuat objek konstruktor 3 pake input
        Scanner input = new Scanner(System.in);
        System.out.println("\nObjek persegi panjang ke 3");
        System.out.print("Masukkan Panjang = ");
        int pj = input.nextInt();
        System.out.print("Masukkan Lebar = ");
        int lb = input.nextInt();
        mainpersegipanjang pp3 = new mainpersegipanjang(pj,lb);
        System.out.println("Luas     = "+pp3.hitungLuas());
        System.out.println("Keliling = "+pp3.hitungKeliling());
        
        }
    
}
*/