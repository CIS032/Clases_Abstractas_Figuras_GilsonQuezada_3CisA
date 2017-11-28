/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goquezadag
 */
public class Triangulo extends Figuras {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        double res = (base * altura) / 2;
        return res;
    }

    @Override
    public double perimetro() {
        double res = 3 * base;
        return res;
    }

}
