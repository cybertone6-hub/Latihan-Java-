/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LUTVI
 */
public class PembayaranKartuKredit extends Pembayaran{
    
    private String nomorKartu;

    public PembayaranKartuKredit(String nomorKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("Nomor Kartu :" + nomorKartu);
        System.out.println("id Transaksi:" + idTransaksi);
        System.out.println("jumlah bayar:" +"Rp" + jumlahBayar);
    }
    
}
