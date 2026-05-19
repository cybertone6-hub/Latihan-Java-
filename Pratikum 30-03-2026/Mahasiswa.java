/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum30032006;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class Mahasiswa {
     //konstruktor
    
    int  Nim;
    char  Nama;
    double  Tugas;
    double  UTS;
    double  UAS;
    
    Mahasiswa()
    {
        
    }
    Mahasiswa( int a,char b,double c,double d,double e)
    {
        Nim = a;
        Nama = b;
        Tugas = c;
        UTS = d;
        UAS = e;
    }
    double HitungnilaiAkhir()
    {
        return( 0.25*Tugas + 0.35*UTS + 0.40*UAS );
    }
    
    
}
