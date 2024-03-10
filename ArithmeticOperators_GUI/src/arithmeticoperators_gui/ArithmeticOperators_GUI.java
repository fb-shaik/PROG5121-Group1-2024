
package arithmeticoperators_gui;

import javax.swing.JOptionPane; //required to set-up a GUI for the app
public class ArithmeticOperators_GUI {

    public static void main(String[] args) {
       String inputA = JOptionPane.showInputDialog("Enter a value for A: ");
       int a = Integer.parseInt(inputA);
       
       String inputB = JOptionPane.showInputDialog("Enter a value for B: ");
       int b = Integer.parseInt(inputB);
       
       //Arithmetic Operators: +, -, *, /, %(mod)
       int sum = a + b; 
       JOptionPane.showMessageDialog(null, "Sum: " + sum);
       
       int difference = a - b;
       JOptionPane.showMessageDialog(null, "Difference: " + difference);
      
       int product = a * b;
       JOptionPane.showMessageDialog(null,"Product: " + product);
       
       int division = a / b;
       JOptionPane.showMessageDialog(null,"Division: " +  division);
       
       int modulus = a % b;
       JOptionPane.showMessageDialog(null,"Modulus: " +  modulus);
       
//Order of Precedance: BODMAS
        int result = (a*b)+5*2+product;
        JOptionPane.showMessageDialog(null,"Order of Precedance Result: " +  result);

       
       
       
    }
    
}
