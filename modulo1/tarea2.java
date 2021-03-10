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
public class tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float num1;
        float num2;
        float res;
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese primer número\n");
        num1 = scanner.nextFloat();
          
        System.out.println("ingrese Segundo número\n");
        num2 = scanner.nextFloat();
        
        //sum
        res = num1 + num2;
        System.out.println("\n resultado de la suma es: "+ res);
        
        //rest
        res = num1 - num2;
        System.out.println("\n resultado de la resta es: "+ res);
        
        //multi
        res = num1 * num2;
        System.out.println("\n resultado de la multiplicación es: "+ res);
        
        // div
        res = num1 / num2;
        System.out.println("\n resultado de la división es: "+ res);
        
    }
    
}
