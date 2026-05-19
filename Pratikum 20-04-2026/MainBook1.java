/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum20042026;

/**
 *
 * @author LUTVI
 */
public class MainBook1 {
    public static void main(String [] args){
        //we need a author instance to create a book instance
        
        Author Rin = new Author("Rinaldi Munir","rinaldi@gmail.com",'m');
        System.out.println(Rin); // Author to String
        //Rinaldi Munir
        
        Book dummyBook = new Book ("Algoritma dan Pemograman",Rin,98000,99);
        System.out.println(dummyBook);
        
        
        
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        
        System.out.println("name is : " + dummyBook.getName());
        
        System.out.println("price is : "+ dummyBook.getPrice());
        
        System.out.println("qty is : "+ dummyBook.getQty());
        
        System.out.println("author is : " + dummyBook.getAuthor());
        
        System.out.println("autho's name is : " + dummyBook.getAuthor().getEmail());
        
        System.out.println("autho's email is : " + dummyBook.getAuthor().getEmail());
        //author email
        System.out.println("author's gender is : " + dummyBook.getAuthor().getGender());
        //gender m
        
        Book moreDummyBook = new Book("Java for more dummies",new Author("Peter lee","peter@nowhere.com",'m'),19.99,8);
             
        System.out.println(moreDummyBook);
        
    }
    
}
