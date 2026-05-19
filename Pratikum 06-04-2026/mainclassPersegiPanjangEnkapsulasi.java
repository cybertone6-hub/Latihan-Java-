/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum06042026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class mainclassPersegiPanjangEnkapsulasi {
    public static void main(String[] args) {
        PersegiPanjangEnkasulapsi pp1 = new PersegiPanjangEnkasulapsi();
        pp1.setPanjang(20);
        pp1.setLebar(10);
        int luas = pp1.getLuas();
        System.out.println("Objek persegi panjang pertama");
        System.out.println("Panjang  = "+pp1.getPanjang());
        System.out.println("Lebar    = "+pp1.getLebar());
        System.out.println("Luas     = "+pp1.getLuas());
        System.out.println("Keliling = "+pp1.getKeliling());
        
        //membuat objek kedua konstruktor dua
        PersegiPanjangEnkasulapsi pp2 = new PersegiPanjangEnkasulapsi(10,5);
        luas = pp2.getLuas();
        System.out.println("Objek persegi panjang pertama");
        System.out.println("Panjang  = "+pp2.getPanjang());
        System.out.println("Lebar    = "+pp2.getLebar());
        System.out.println("Luas     = "+pp2.getLuas());
        System.out.println("Keliling = "+pp2.getKeliling());
       
        //membuat objek konstruktor 3 pake input
        Scanner input = new Scanner(System.in);
        System.out.println("\nObjek persegi panjang ke 3");
        System.out.print("Masukkan Panjang = ");
        int pj = input.nextInt();
        System.out.print("Masukkan Lebar = ");
        int lb = input.nextInt();
        PersegiPanjangEnkasulapsi pp3 = new PersegiPanjangEnkasulapsi(pj,lb);
        System.out.println("Luas     = "+pp3.getLuas());
        System.out.println("Keliling = "+pp3.getKeliling());
        
        }
    
}
