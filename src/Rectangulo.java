
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goquezadag
 */
public class Rectangulo extends Figuras{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area() {
        double res=base*altura;
        return res;
    }

    @Override
    public double perimetro() {
        double res=(base*2)+(altura*2);
        return res;
    }
    
}
