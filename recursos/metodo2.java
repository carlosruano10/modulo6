/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.recursos;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class metodo2 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.print("Ingresa edad: ");
        edad = scanner.nextInt();
        
        mensajedelmetodo2  verificar = new mensajedelmetodo2();       
        verificar.VerificarEdad(edad);
    }
    
}
