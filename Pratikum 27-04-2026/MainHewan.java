/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author LUTVI
 */
public class MainHewan {

    public static void main(String[] args){
        
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("Bobby");
        Anjing anjingku=new Anjing("Helly");
        
        System.out.println("tampilkan Akses super class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        System.out.println("\tampilan akses sub class kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        System.out.println("\tampilan akses sub class anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
    }    
    
}
