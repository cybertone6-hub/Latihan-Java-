/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LUTVI
 */
public class PembayaranTransfer extends Pembayaran{
    
    private String namaBank;

    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("Nama Bank Tujuan :" + namaBank);
        System.out.println("id Transaksi:" + idTransaksi);
        System.out.println("jumlah bayar:" +"Rp" + jumlahBayar);

    }
    
}
