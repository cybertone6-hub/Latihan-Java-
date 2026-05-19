/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiTransportasiOnline;

/**
 *
 * @author LUTVI
 */
public class TransportasiMotor extends Transportasi{
    
    private String namaMotor;

    public TransportasiMotor(String namaMotor, double jumlahBayar, String namaPenumpang, String Tujuan) {
        super(namaPenumpang, Tujuan, jumlahBayar);
        this.namaMotor = namaMotor;
    }

    public String getNamaMotor() {
        return namaMotor;
    }

    public void setNamaMotor(String namaMotor) {
        this.namaMotor = namaMotor;
    }
    
    @Override
    public void biayaPerjalanan(){
        System.out.println("===Memakai Motor===");
        System.out.println("Nama Motor : " + namaMotor);
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan : "+ Tujuan);
        System.out.println("Harga : " +jumlahBayar);
    }
    
}
