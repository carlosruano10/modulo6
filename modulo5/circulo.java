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
public class circulo {

    private static class Formas {

        public Formas() {
        }
    }
    public class Circulo extends Formas {

private double radio;
private static final double PI = Math.PI;
private double area;
private double contorno;

protected void dibujar() {

}

public double getRadio() {
return radio;
}

public void setRadio(double radio) {
this.radio = radio;
}

public double getArea() {
return area;
}

public void setArea(double area) {
this.area = area;
}

public double getContorno() {
return contorno;
}

public void setContorno(double contorno) {
this.contorno = contorno;
}

public double calcularArea(double radio) {
this.area = 0;
this.radio = radio;
if (this.radio > 0) {
area = PI * this.radio * this.radio;
}
return this.area;
}
}

    
}
