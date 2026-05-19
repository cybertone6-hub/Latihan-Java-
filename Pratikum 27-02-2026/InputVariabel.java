/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270226;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class InputVariabel {
    public static void main(String[]args){
      Scanner in = new Scanner(System.in);
      String huruf,nama;
      int umur;
      float angka;
      
      System.out.print("Masuukkan sebuah bilangan huruf : ");
      huruf = in.nextLine();
      
      System.out.print("Masukkan sebuah bilangan pecahan : ");
      angka = in.nextFloat();
      System.out.println("angka = " +angka);
      in.nextLine();
      
      System.out.print("Masukkan nama anda : ");
      nama = in.nextLine();
      
      System.out.print("Masukkan umur anda : ");
      umur = in.nextInt();
    }
    
    
}
