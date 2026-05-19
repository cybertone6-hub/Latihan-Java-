/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiTransportasiOnline;

/**
 *
 * @author LUTVI
 */
public class TransportasiBis extends Transportasi{
    
    private String namaBis;

    public TransportasiBis(String namaBis, double jumlahBayar, String namaPenumpang, String Tujuan) {
        super(namaPenumpang, Tujuan, jumlahBayar);
        this.namaBis = namaBis;
    }

    public String getNamaBis() {
        return namaBis;
    }

    public void setNamaBis(String namaBis) {
        this.namaBis = namaBis;
    }
    
    @Override
    public void biayaPerjalanan(){
        System.out.println("===Memakai Bis===");
        System.out.println("Nama Bis : " + namaBis);
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan : "+ Tujuan);
        System.out.println("Harga : " +jumlahBayar);
    }
    
}
