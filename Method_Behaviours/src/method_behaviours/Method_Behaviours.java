
package method_behaviours;
//This App will illustrate some of the behaviours & pitfalls when using methods

public class Method_Behaviours {

    //Example1: This method illustrates nested blocks & variable scoping
    public static void methodWithNestedBlocks(){
        int aNumber = 10; //Local declared variable that has been initialized; This variable only exists within the method it has been declared
        System.out.println("In the outer block, aNumber is : " + aNumber); //Print the aNumber value on console
           
        {//Inner Block 
                    int anotherNumber = 512; //Local declared variable that has been initialized; This variable only exists within the method it has been declared
                System.out.println("In the inner block, aNumber is: " + aNumber + " and another number is: " + anotherNumber);
                //Print the value of aNumber & anotherNumber within the inner block task
            }//End of the Inner Block
        System.out.println("Printing the outer block again, aNumber:  " + aNumber);
    }
    
    //Example2: A method that demonstrates multiple decalrations of a variable in the different blocks
    public static void twoDeclarations(){
        {//Start of the first block
                int someVar = 7; //Local declared variable that has been initialized; exists within this method only
                System.out.println(someVar + " : This variable has been declared in the first block");
        }//End of the first block
        
        {//Start of the second block
            int someVar = 234; //Local declared variable that has been initialized; exists within this method only
            System.out.println(someVar + " : This variable has been declared in the second block");
        }//End of the second block
    
    }
    
    //Example 3: Method with an invalid re-declaration of variables within the same scope
    public static void invalidReDeclaration(){
        {  int aValue = 3;}
        int aValue = 4;  //Renders an error because you are trying to have two variables with the same name in the same scope
    
            {//inner block
                    int myValue = 10;
                    int aValue = 4;  ///Renders an error because you are trying to have two variables with the same name in the same scope of the main portion of the method Body
                    int myValue = 12; //Renders an error because you are trying to have two variables with the same name in the same scope
            }
    
    }
    
    
    
    public static void main(String[] args) {
        //Invoke or call the first example method: methodWithNestedBlocks
        System.out.println("Executing a method with nested blocks");
        methodWithNestedBlocks(); 
        System.out.println();
        
        System.out.println("Executing a method with two declarations of the same variable name in different blocks:");
        twoDeclarations();
        System.out.println();
    }
    
}
