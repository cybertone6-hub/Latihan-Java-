/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemPenggajianKaryawan;

/**
 *
 * @author LUTVI
 */
public class Karyawan {
    
    protected String nama;
    private double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double hitungTotalGaji() {
        return gajiPokok;
    }
    
    public void cetakData(){
        System.out.println("Nama Karyawan = " + nama);
        System.out.println("Gaji Pokok = Rp " + gajiPokok);
    }
}
