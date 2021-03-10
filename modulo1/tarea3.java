/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.modulo1;

/**
 *
 * @author dell
 */
public class tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int M =6;
        int T = 1;
        int K = -10;
        boolean resM = false;
        boolean resT = false;
        boolean resK = false;
        
        if (M>T) {
        resM = true;
        }
        
        if (T/K == -5) {
            resT = true;
        }
        
        if ((M+T==7)||(M-T == 5)){
            resK = true;
        }
        
        System.out.print("\n resultado de M>T es:" + resM);
        System.out.print("\n resultado de T/K == -5 es:" + resT);
        System.out.print("\n resultado de (M+T==7)||(M-T == 5) es:" + resK);
        
    }
    
}
