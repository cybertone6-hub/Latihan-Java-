/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiTransportasiOnline;

/**
 *
 * @author LUTVI
 */
public class TransportasiMobil extends Transportasi{
    
    private String namaMobil;

    public TransportasiMobil(String namaMobil, String namaPenumpang, String Tujuan, double jumlahBayar) {
        super(namaPenumpang, Tujuan, jumlahBayar);
        this.namaMobil = namaMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }
    
    @Override
    public void biayaPerjalanan(){
        System.out.println("===Memakai Mobil===");
        System.out.println("Nama Mobil : " + namaMobil);
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan : "+ Tujuan);
        System.out.println("Harga : " +jumlahBayar);
    }

    
    
    
    
}
