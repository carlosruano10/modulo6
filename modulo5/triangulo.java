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
public class triangulo {

    private static class Formas {

        public Formas() {
        }
    }
    
    public class Triangulo extends Formas {

private double base;
private double altura;
private double angulo;

public double getBase() {
return base;
}

public void setBase(double base) {
this.base = base;
}

public double getAltura() {
return altura;
}

public void setAltura(double altura) {
this.altura = altura;
}

public double getAngulo() {
return angulo;
}

public void setAngulo(double angulo) {
this.angulo = angulo;
}

public double calcularArea(double base, double altura) {
double area = 0;
this.base = base;
this.altura = altura;

if (this.base > 0 && this.altura > 0) {
area = (this.base * this.altura) / 2;
}
return area;
}

protected void dibujar() {

}

}

    
}
