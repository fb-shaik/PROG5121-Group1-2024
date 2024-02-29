/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables_2024;

/**
 *
 * @author fshaik
 */
public class Variables_2024 {

    //this is the main method
    public static void main(String[] args) {
        //How to declare a variable & constant
        //datatype variableName;
        //final datatype variableName = initial value;
        //final datatype CONSTANTNAME = fixedValue;
        
        String name; //declared variable 
        name = "JOE";//assigned a value
        //shortcut key for the below command: sout & the tab key
        //System.out.println("");
        
        System.out.println("Hello World!"); //literal string
        System.out.println(name);
        System.out.println("Hello World! " + name);
        
        //String number = 12;//Error: complier is reading this as a numeric
        String position = "12";//this is accepted because its read as string datatype because of the ""
        //memory spaced name = value to be held
        //"12" = number String;(this is wrong.....)
        position = "*, - , / , +";
        
        String Company_Name = ""; //this is a variable because keyword final is missing
        //String COMPANY_NAME = "ABC Holdings";//this is a string & keyword final is missing
        final String COMPANY_NAME = "ABC Holdings"; //this is a constant beacause it has UPPERCASE letters & final
        //constants have a fixed assigned value; never changes unless the programmer decides to change it
        
        System.out.println(COMPANY_NAME);
         
    }//this is the end of the main method
}

