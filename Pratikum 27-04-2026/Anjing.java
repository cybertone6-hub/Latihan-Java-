/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author LUTVI
 */
public class Anjing extends Hewan{
    
    public Anjing(String nama){
        super(nama);
    }
    
    
    @Override
    public void bersuara(){
        System.out.println(nama+"berkata gok!! gok!!");
    }
}
