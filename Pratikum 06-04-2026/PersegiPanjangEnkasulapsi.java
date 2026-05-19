/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum06042026;

/**
 *
 * @author LAB-SI-PC
 */
public class PersegiPanjangEnkasulapsi {
    
    private int Panjang;
    private int Lebar;
    private static int JumlahObjek = 0;
    
    
    public PersegiPanjangEnkasulapsi(){
        JumlahObjek++;
    }
    public PersegiPanjangEnkasulapsi(int Panjang,int Lebar){
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        JumlahObjek++;
    }
    public void setPanjang(int Panjang){
        this.Panjang = Panjang;
    }
    public int getPanjang(){
        return Panjang;
    }
    public void setLebar(int Lebar){
        this.Lebar = Lebar;
    }
    public int getLebar(){
        return Lebar;
    }
    public static int getJumlahObjek(){
        return JumlahObjek;
    }
    public int getLuas(){
        return (Panjang*Lebar);
    }
    public int getKeliling(){
        return (2*(Panjang*Lebar));
    }
}
