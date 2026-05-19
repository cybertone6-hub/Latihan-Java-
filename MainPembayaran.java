/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;
import java.util.Scanner;

/**
 *
 * @author LUTVI
 */
public class MainPembayaran {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        
        Pembayaran pembayaran =null;
        
        System.out.println("---Sistem Pembayaran Toko ONLINE---");
        System.out.println("Masukkan ID Transaksi = ");
        String id= scanner.nextLine();
        
        System.out.println("Masukkan jumlah bayar");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih Metode Pembayaran : ");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Pilihan Metode Pembayaran Anda (1/2/3) ");
        int pilihan =scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan){
            case 1 :    System.out.println("Metode Transfer Bank");
                        System.out.println("Masukkan Nama Bank Tujuan = ");
                        String bank=scanner.nextLine();
                        pembayaran = new PembayaranTransfer(bank,jumlah,id);
                        break;
             
            case 2 :    System.out.println("Metode Kartu Kredit");
                        System.out.println("Masukkan Nomor Kartu Kredit");
                        String kartuKredit=scanner.nextLine();
                        pembayaran = new PembayaranKartuKredit(kartuKredit,jumlah,id);
                        break;
                        
            case 3 :    System.out.println("Metode E-Wallet");
                        System.out.println("Masukkan Nama Bank Tujuan = ");
                        String nomorHP=scanner.nextLine();
                        pembayaran = new PembayaranEWallet(nomorHP,jumlah,id);
                        break;            
        }
        
        System.out.println("\n==Konfirmasi Bukti Pembayaran===");
        pembayaran.prosesPembayaran();
    }
    
}
