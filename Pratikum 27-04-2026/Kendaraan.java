/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author LUTVI
 */
public class Kendaraan {

    private String nama;
    private int tahunProduksi;
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    } 
    
    public int gettahunProduksi(){
        return tahunProduksi;
    }
    
    public void settahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    
    public Kendaraan(){
        
    }
    
    public Kendaraan(String nama,int tahunProduksi){
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void cetak() {
    // Isi dari method cetak, biasanya digunakan untuk menampilkan data
    System.out.println("Nama: " + this.nama);
    System.out.println("Tahun Produksi: " + this.tahunProduksi);
    }
    
    
}
