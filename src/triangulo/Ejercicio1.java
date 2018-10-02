/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import javax.swing.*;

/**
 *
 * @author Andrea CG
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 Objeto = new Ejercicio1();
        double altura,base;
        base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: "));
        JOptionPane.showMessageDialog(null, "area: " + Objeto.area(altura, base));
        JOptionPane.showMessageDialog(null, "perimetro: " + Objeto.perimetro(altura, base));

    }
    public double area(double b, double a){
        double area = (b * a)/2;
        return area;
    }
    
    public double perimetro(double b, double a){
        double perimetro = b * 3;
        return perimetro;
    }
}
