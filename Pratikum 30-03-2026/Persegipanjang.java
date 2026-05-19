/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum30032006;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class Persegipanjang {
    
        //konstruktor
        int panjang;//atribut
        int lebar;  //atribut
        
        Persegipanjang(){
        
        }
    
        Persegipanjang(int a,int b)
        {
            panjang = a;
            lebar   = b;
        }
        
        //method
        int hitungLuas()
        {
            return(panjang*lebar);
        }
        int hitungKeliling()
        {
            return(2*(panjang*lebar));
        }
    }

