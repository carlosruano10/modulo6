/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.modulo5;

/**
 *
 * @author dell
 */
public class cuadrado {

    private static class Formas {

        public Formas() {
        }
    }
    
    public class Cuadrado extends Formas {

private double lado;

public double getLado() {
return lado;
}

public void setLado(double lado) {
this.lado = lado;
}

protected void dibujar() {

}

public double area(double lado) {
double area = 0;
this.lado = lado;
if (this.lado > 0) {
area = Math.pow(lado, 2);
}
return area;
}
}
    
}
