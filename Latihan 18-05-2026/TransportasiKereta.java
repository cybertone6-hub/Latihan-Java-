/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiTransportasiOnline;

/**
 *
 * @author LUTVI
 */
public class TransportasiKereta extends Transportasi {

    private String namaKereta;

    public TransportasiKereta(String namaKereta, double jumlahBayar, String namaPenumpang, String Tujuan) {
        super(namaPenumpang, Tujuan, jumlahBayar);
        this.namaKereta = namaKereta;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public void setNamaKereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }

    public void biayaPerjalanan(){
        System.out.println("===Memakai Kereta===");
        System.out.println("Nama Kereta : " + namaKereta);
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan : "+ Tujuan);
        System.out.println("Harga : " +jumlahBayar);
    }
    
}
