/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiTransportasiOnline;
import java.util.Scanner;
/**
 *
 * @author LUTVI
 */
public class MainTransportasi {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        
        Transportasi transportasi =null;
        
        System.out.println("---Metode Pembayaran---");
        System.out.println("Masukkan Nama Penumpang = ");
        String id= scanner.nextLine();
        
        System.out.println("Masukkan Tujuan = ");
        String tj= scanner.nextLine();
        
        System.out.println("Masukkan jumlah bayar");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih Transportasi : ");
        System.out.println("1. Mobil");
        System.out.println("2. MOtor");
        System.out.println("3. Bis");
        System.out.println("4. Kereta");
        System.out.print("Pilihan Kendaraan (1/2/3/4) ");
        int pilihan =scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan){
            case 1 :    System.out.println("Mobil");
                        System.out.println("Masukkan Nama Mobil = ");
                        String MOBIL=scanner.nextLine();
                        transportasi = new TransportasiMobil(MOBIL,id,tj,jumlah);
                        break;
             
            case 2 :    System.out.println("Motor");
                        System.out.println("Masukkan Nama Motor= ");
                        String MOTOR=scanner.nextLine();
                        transportasi = new TransportasiMotor(MOTOR,jumlah,id,tj);
                        break;
                        
            case 3 :    System.out.println("BIS");
                        System.out.println("Masukkan Nama BIS = ");
                        String BIS=scanner.nextLine();
                        transportasi = new TransportasiBis(BIS,jumlah,id,tj);
                        break;            
                        
            case 4 :    System.out.println("Kereta");
                        System.out.println("Masukkan Nama Kereta = ");
                        String KERETA=scanner.nextLine();
                        transportasi = new TransportasiKereta(KERETA,jumlah,id,tj);
                        break;             
        }
        
        System.out.println("\n===Biaya Perjalanan===");
        transportasi.biayaPerjalanan();
    }    
    
}
