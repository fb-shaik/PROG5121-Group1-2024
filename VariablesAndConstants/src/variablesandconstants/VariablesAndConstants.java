/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variablesandconstants;

/**
 *
 * @author fshaik
 */
public class VariablesAndConstants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Numeric Variables
        int age = 1; //Integer Variable
        double salary = 5000.52385349;//Double Variable; holds decimal values
        double price = 100;//Double can hold both whole & decimal values
        float averageScore = 85.5f;//Small space in memory than the double; 
        //Floating type has to have the 'f' placed after the value
        
        //Numeric Constants
        final double DISCOUNT = 10; //This discount is fixed at 10 to represent R10.00
        final double DISCOUNT_1 = 0.10; //This discount is fixed at 10% & has be declared as a decimal value
        // The percentage symbol is an arithmetic operator & cannot be used as part of the declaration
        
        final int CLASS_SIZE = 30; // set number of people that can fit in a class
        
        String name = ""; //variable that has just been declared with & empty string space
        String lastName = "Blog"; //variable declared with an initialized value
        char grade = 'A'; //character declared with an intiliazed value
        //char response = ''; not allowed to have an empty character space as the intialized value
        
        
        //Boolean Datatype - Used to store only 2 possiblities (true/false)
        //The intialized value is the default position set for the boolean behaviour
        boolean isJavaFun = false; 
        boolean pass = true;
        
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Did the student pass? " + pass);
    }
    
}
