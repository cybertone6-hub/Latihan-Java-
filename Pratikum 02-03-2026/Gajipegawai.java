/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum020326;

/**Program   : GajiPegawai.java
 * Pembuat   : Muhammad Lutvi
 * Tanggal   : 02 maret 2026
 * Deskripsi : Menghitung gaji bulana pegawai berdasarkan jam kerja
 */

import java.util.Scanner; //input nilai menggunakan Scanner wajib import kelas
public class Gajipegawai {
    public static void main(String[]args){
        int upahregular = 50000;
        int upahlembur = 70000;
        int jamkerjaregular, jamkerjalembur, gajisebulan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Program Memghitng Gaji Bulanan Pegawaui===");
        System.out.print("\tjam kerja regular\t");
        jamkerjaregular = input.nextInt();
        System.out.print("\tjam kerja lembur\t");
        jamkerjalembur = input.nextInt();
        gajisebulan = (jamkerjaregular*upahregular)+(jamkerjalembur*upahlembur);
        System.out.println("\tGaji Pegawai bulan ini\t= "+gajisebulan);
    }
    
}
