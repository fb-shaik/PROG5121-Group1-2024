
package method_overloading_demo;

//App to illustrate method overloading
//Method Overloading: A method can have many versions of itself
//The complier is able to know which version to call/invoke at runtime
//based on the parameter list of the method

public class Method_Overloading_Demo {
  
    //Method Signature: accessSpecifier, static/non-static, void/dataTypeReturn MethodName(paramter list) {}
    
    //1st version of the method, has no parameters
    public static void displayTwiceNumber(){
        //method body: Everything that is contained within the {} are part of the method body
    } 
    
    //2nd version of the method, receives a single parameter & held in: (dataType parameterName)
    public static void displayTwiceNumber(int n){
        //method body{}
        final int FACTOR = 2; //Local declaration
        int result = (FACTOR * n); //Result variable is a local declared variable
        System.out.println( n + " multiplied by a factor of: " + FACTOR + " has a result of: " + result);
    
    }
    
    //3rd version of the method, multiple parameters & held in: (dataType parameterName,dataType parameterName)
    //a method call with multiple parameters: displayTwiceNumber(num1, num2, num3);
    public static void displayTwiceNumber(int jam, int jelly, int coconut){
    
    //declare a fix price for jam, jelly, coconut
        final int JAMPRICE = 25;
        final int JELLYPRICE = 35;
        final int COCONUTPRICE = 40;
    //code the calculation for each item based on the set price & parameter sent
    int totalJam = JAMPRICE * jam;
    int totalJelly = JELLYPRICE * jelly;
    int totalCoconut = COCONUTPRICE * coconut;
    //display the result of each (jam, jelly, coconut)
        System.out.println( jam + " jam cans at a price of R: " + JAMPRICE + " will cost: R " + totalJam);
        System.out.println( jelly + " jelly cans at a price of R: " + JELLYPRICE + " will cost: R " + totalJelly);
        System.out.println( coconut + " coconuts at a price of R: " + COCONUTPRICE + " will cost: R " + totalCoconut);
    }
    
    
    
    public static void main(String[] args) {
        //This is main method; everything we want to happen in the app has to be placed here
        //Use global declared variables that will sent a value to be used in the method-overload call
        
        int num1 = 10; //dataType variableName = initialValue;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        
        //Invoke/Call the method & pass along the above variables 
        displayTwiceNumber(num1); //a single parameter call>>>We can only send 1 piece of info to the method
        displayTwiceNumber(num2);
        displayTwiceNumber(num3);
        displayTwiceNumber(num4);
        
        //a method call with multiple parameters
        displayTwiceNumber(num1, num2, num3);
        
        
        
    }
    
    
    
}
