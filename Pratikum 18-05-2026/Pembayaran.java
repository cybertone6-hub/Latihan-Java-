/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LUTVI
 */
public abstract class Pembayaran {
   
    protected double jumlahBayar;
    protected String idTransaksi;
    
    public Pembayaran(double jumlahBayar,String idTransaksi){
       this.jumlahBayar=jumlahBayar;
       this.idTransaksi=idTransaksi;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }
    
    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getIdTransakai() {
        return idTransaksi;
    }
    
    public void setIdTransakai(String idTransakai) {
        this.idTransaksi = idTransakai;
    }
    
    public abstract void prosesPembayaran();
            
}
