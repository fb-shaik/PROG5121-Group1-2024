
package methods_demo_2024;

//App looks at the use of methods
//Method: A block of code that will perform a set of tasks
//Two Types
//1. User defined (dev create these methods)
//2. Standard Library methods (built-in methods from Libr. / Java itself)
//java.lang>>>Built-in methods
//javax.swing>>>>Built-in methods
//java.util>>>Built-in methods
public class Methods_Demo_2024 {

//user-defined methods can be placed above the Main Method
 
    public static void main(String[] args) {
        //method call (invoke a method)
        //you are calling the set of code contained in the method
        //Template: methodName();
        displayAddress();//no argument & returns no value method
        displayAddress();
        displayAddress();
        displayAddress();
    }
    
    //user-defined methods can be placed below the Main Method
    //Method Signature: accessSpecifier static/non-static dataReturnType MethodName()
    public static void displayAddress(){
        //method body
        System.out.println("ABC TECH-WORLD");
        System.out.println("123 Happy Place");
        System.out.println("Lego World");
        System.out.println("\n------------------------------------\n");
        //no return keyword for this method because of the void keyword in the method signature
}
}
