/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


/**
 *
 * @author USER
 */
 import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    FileHandler fileHandler = new FileHandler();
    fileHandler.createFile();
   
    
    System.out.println("Name");
    String name = sc.nextLine();
     System.out.println("Phone number");
    String phoneNumber = sc.nextLine();
     System.out.println("Email");
    String email = sc.nextLine();
     fileHandler.writeFile(name, phoneNumber, email);
    }}