/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiTransportasiOnline;

/**
 *
 * @author LUTVI
 */
public abstract class Transportasi {
    
    protected String namaPenumpang;
    protected String Tujuan;
    protected double jumlahBayar;

    public Transportasi(String namaPenumpang, String Tujuan, double jumlahBayar) {
        this.namaPenumpang = namaPenumpang;
        this.Tujuan = Tujuan;
        this.jumlahBayar = jumlahBayar;
    }

    public String getTujuan() {
        return Tujuan;
    }

    public void setTujuan(String Tujuan) {
        this.Tujuan = Tujuan;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }
    
    
    public abstract void biayaPerjalanan();

}
