/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum020326;

/**Program : BonusAkhirTahun.c
 * Pembuat : Muhammad Lutvi
 * Tanggal : 02 maret 2026
 * Deskripsi : menentukan besar bonus akhir tahun
 */

import java.util.Scanner;

public class Bonusakhirtahun1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        int gol,masakerja,umur;
        long bonus = 0;
        
        System.out.println("====Program Bonus Akhir Tahun====");
        System.out.println("Golongan karyawan : \n 1. Staf\n 2. Non-staf");
        System.out.println("================================");
        System.out.print("Golongan anda (1/2)\t");
        gol = in.nextInt();
        System.out.print("Lama kerja\t\t: ");
        masakerja=in.nextInt();
        System.out.print("Usia\t\t\t: ");
        umur=in.nextInt();
        switch(gol){
            case 1: 
            {
                if(masakerja>=5 && umur>=45)
                    bonus=10000000;
                else if (masakerja>=5 && umur<45)
                    bonus=50000000;
            }break;
            case 2:
            {
                if (masakerja>5 && umur>45)
                bonus=6000000;
                else
                    bonus=25000000;
            }break;
            default:
            {
                System.out.println("Golongan anda salah");
                bonus = 0;
            }break;
        }
        System.out.println("bonus akhir tahun anda \t: Rp. "+bonus+",-");
    }

   
    
        
}
    

