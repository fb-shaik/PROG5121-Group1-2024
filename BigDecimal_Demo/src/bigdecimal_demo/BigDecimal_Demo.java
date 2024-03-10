/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bigdecimal_demo;
import javax.swing.JOptionPane;

import java.math.BigDecimal; // Importing BigDecimal from java.math package

public class BigDecimal_Demo {

    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Enter a value for A: ");
        BigDecimal a = new BigDecimal(inputA); // Parse input to BigDecimal

        String inputB = JOptionPane.showInputDialog("Enter a value for B: ");
        BigDecimal b = new BigDecimal(inputB); // Parse input to BigDecimal

        // Arithmetic Operators: +, -, *, /, %(mod)
        BigDecimal sum = a.add(b); // Perform addition using BigDecimal
        JOptionPane.showMessageDialog(null, "Sum: " + sum);

        BigDecimal difference = a.subtract(b); // Perform subtraction using BigDecimal
        JOptionPane.showMessageDialog(null, "Difference: " + difference);

        BigDecimal product = a.multiply(b); // Perform multiplication using BigDecimal
        JOptionPane.showMessageDialog(null, "Product: " + product);

        BigDecimal division = a.divide(b); // Perform division using BigDecimal
        JOptionPane.showMessageDialog(null, "Division: " + division);

        BigDecimal modulus = a.remainder(b); // Perform modulus using BigDecimal
        JOptionPane.showMessageDialog(null, "Modulus: " + modulus);

   
    }
}
