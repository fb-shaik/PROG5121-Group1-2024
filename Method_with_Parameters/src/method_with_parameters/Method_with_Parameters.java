
package method_with_parameters;
//The app will show how a method with parameters works
import javax.swing.JOptionPane;
public class Method_with_Parameters {
    //user defined methods
    
    //Method to add two numbers & return the result back to Main for Display
    //Method Signature: accessSpecifier static/non-static dataReturnType MethodName(parameterList)
    public static int add(int num1, int num2){ 
      //return keyword + the data that is to be sent out of the method elsewhere  
    return num1 + num2;
    }
    //Method to subtract two numbers & return the result back to Main for Display
    public static int subtract(int num1, int num2){
    return num1 - num2;
    }
    

   
    public static void main(String[] args) {
        //Prompt user for two numbers
        String inputNum1 = JOptionPane.showInputDialog("Enter the first number: ");
        int num1 = Integer.parseInt(inputNum1);
        
        String inputNum2 = JOptionPane.showInputDialog("Enter the second number: ");
        int num2 = Integer.parseInt(inputNum2);
        
        //method call with parameters & returning value
        int sum = add(num1, num2); //num1 & num2 are refered as 'Arguments'
        int difference = subtract(num1,num2); //method call for subtract method
        
        JOptionPane.showMessageDialog(null, "The result of the Add() is: " + sum);
        JOptionPane.showMessageDialog(null, "The result of the Subtract() is: " + difference);
        
        
    }
    
}
