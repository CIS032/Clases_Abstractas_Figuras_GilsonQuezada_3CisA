/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goquezadag
 */
public class Circulo extends Figuras{
    public final double PI=3.1416;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
        double res=(2*PI)*radio;
        return res;
    }

    @Override
    public double perimetro() {
        double res=PI*Math.pow(radio, 2);
        return res;
    }
    
}
