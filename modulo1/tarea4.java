/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.modulo1;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
       String[] ciudades = new String[20];
       int contador = 1;
       
       System.out.print("Diga el nombre de 20 ciudades");
        for (int c = 0; c < 20; c++) {
            System.out.print("\nDiga ciudad Número " + contador + ":" );
            ciudades[c] = scanner.next();
            contador= contador + 1;
        }  
        
        System.out.print("\n ciudades digitadas son:");
        for (int c = 0; c <20; c++) {
            System.out.print("\n" + ciudades[c]);
    }
    
}
}
