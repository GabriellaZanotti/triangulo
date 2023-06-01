/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double base=0;
        double altura=0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua base");
        base=scanner.nextDouble();
        System.out.println("Digite a altura");
        altura=scanner.nextDouble();
        double triangulo=(base*altura)/2;
        System.out.print("Seu resultado é"+triangulo);
        
    }
}