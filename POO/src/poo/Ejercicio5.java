/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario12
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double a, b;

        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer valor"));

     
        double c = a + b;
        JOptionPane.showMessageDialog(null, "El resultado de la suma de " + a + " + " + b + " Es igual " + c);
        double d = a - b;
        JOptionPane.showMessageDialog(null, "El resultado de la resta de " + a + " + " + b + " Es igual " + d);
        double f = a * b;
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion de " + a + " + " + b + " Es igual " + f);
        double g = a / b;
        JOptionPane.showMessageDialog(null, "El resultado de la division de " + a + " + " + b + " Es igual " + g);
    }

}

