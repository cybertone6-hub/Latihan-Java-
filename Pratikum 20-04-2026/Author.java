/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum20042026;

/**
 *
 * @author LUTVI
 */
public class Author {
    //the private instance variable
    private final String name;
    private String Email;
    private final char gender;
    
    //constructor
    public Author(String name,String email,char gender){
        this.name = name;
        this.Email = email;
        this.gender = gender;
    }
    
    //return name
    public String getName(){
        return name;
    }
    //return email
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String email){
        this.Email = email;
    }
    //return gender
    public char getGender(){
        return gender;
    }
    
    /** return a self-descriptive String*/
    public String toString(){
        return name + " (" + gender + ") at " + Email;
    }
    
    
    
    
    
}
