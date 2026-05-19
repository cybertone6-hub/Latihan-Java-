/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum30032006;

/**
 *
 * @author LAB-SI-PC
 */
public class Mainmahsiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa pp1 = new Mahasiswa();
        pp1.Nim = 25001006;
        pp1.Nama = 8;
        pp1.Tugas =80;
        pp1.UTS =70;
        pp1.UAS=90;
        double nilai = pp1.HitungnilaiAkhir();
        System.out.println("Objek persegi panjang pertama");
        System.out.println("NIM  = "+pp1.Nim);
        System.out.println("Nama = "+pp1.Nama);
        System.out.println("Tugas  "+pp1.Tugas);
        System.out.println("Tugas  "+pp1.Tugas);
        System.out.println("UTS  "+pp1.UTS);
        System.out.println("UAS "+pp1.UAS);
        System.out.println("HASIL NILAI = "+pp1.HitungnilaiAkhir());
        // TODO code application logic here
    }
    
}
