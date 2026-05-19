/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author LUTVI
 */
public class Pesawat extends Udara{
    
    private int muatan;
    
    public int getMuatan(){
        return muatan;
    }
    
    public void setMuatan(int muatan){
        this.muatan=muatan;
    }
    
    public Pesawat(){
        
    }
    
    public Pesawat(String nama,int tahunProduksi,boolean mesin,int muatan){
        super(nama,tahunProduksi,mesin);
        this.muatan=muatan;
    }
    
    public void reset(String nama,int tahunProduksi,boolean mesin,int muatan){
        setnama(nama);
        settahunProduksi(tahunProduksi);
        setmesin(mesin);
        setMuatan(muatan);
    }
    
    public String kategori(int muatan){
        if(muatan <= 50)
            return "Bobot Kecil";
        else if (muatan < 100)
            return "Bobot Menengah";
        else 
            return "Bobot Besar";
                
                    
    }
    
    @Override
    public void cetak() {
    // Isi dari method cetak, biasanya digunakan untuk menampilkan data
    super.cetak();
    System.out.println("Muatan Pesawat = " + muatan);
    System.out.println("Kategori = " + kategori(muatan));
    }
    
}
