package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.io.File;
import java.io.IOException;
public class FileHandler {  
    public void createFile(){
    try{
    File file = new File("Contacts.csv");
    if(file.createNewFile()){
System.out.println("File created");
}
        else{
System.out.println("File already exists");}
System.out.println("Location:"+file.getAbsolutePath());
  }
 
 catch(IOException e){
System.out.println("Error");
}
}}
