/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.modulo3;

/**
 *
 * @author dell
 */
public class mensajedelaconsola {
    public static void main(String[] args) {
      consola videojuego = new consola();
      videojuego.setconsola("play 5");
      videojuego.settipo("grande");
      videojuego.setmodelo("pro");
      videojuego.setprecio("20 mil");
      
      System.out.println("consola:" + videojuego.getconsola());
      System.out.println("tipo:" + videojuego.gettipo());
      System.out.println("modelo:" + videojuego.getmodelo());
      System.out.println("precio:" + videojuego.getprecio());
           
    }
    
}
