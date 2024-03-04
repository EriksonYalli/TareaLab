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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double a, b;

        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer valor"));

     
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es " + (a + b) + 
                "\n" + "El resultado de la resta es " + (a - b) +
                "\n" + "El resultado de la multiplicacion es " + (a * b) +
                "\n" + "El resultado de la division es " + (a / b) );
    }
}
