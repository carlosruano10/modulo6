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
public class metodo3 {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        mensajedelmetodo3 operaciones = new mensajedelmetodo3();
        int num1;
        int num2;
        System.out.print("MULTIPLICACION DE DOS NUMEROS");
        System.out.print("\n Ingrese num 1: ");
        num1 = scanner.nextInt();
        
        System.out.print("\n Ingrese num 2: ");
        num2 = scanner.nextInt();
        
        operaciones.Multiplicar(num1, num2);
    }
    
}
