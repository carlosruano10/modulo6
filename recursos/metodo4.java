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
public class metodo4 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mensajedelmetodo4 lista = new mensajedelmetodo4();
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Ingrese numero de lista: ");
        num = scanner.nextInt();
        
        lista.GenerarLista(num);
        
    }
    
}
