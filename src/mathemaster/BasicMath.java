/*
 * This is the basic math module of the MatheMaster calculator
 * 
 * coded by: Kelly B Ward
 */
package mathemaster;

import java.util.*;

public class BasicMath {
    
    public void basicMathController() {
        int userSelection = 0;
        
        System.out.println( "Welcome to the Basic math module!" + "\n" +
                            "The current installed modules are:"
        ); // This is the header and instruction block outprinted to the user.
    //^^^^^^^^^^^^^^^^^^^^^^^^^Welcome message^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        System.out.print(   "#1: Addition" + "\n" +
                            "#2: Subtraction" + "\n" +
                            "#3: Multiplication" + "\n" +
                            "#4: Division" + "\n" +
        ""); // This is the list of installed modules. 
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^Module list^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        ValidateInput runValidation = new ValidateInput();
        userSelection = runValidation.validateInput();
    //^^^^^^^^^^^^^^^^^^^^^Get valid user selection block^^^^^^^^^^^^^^^^^^^^^^^
        
        switch(userSelection) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            
        } // This block runs the appropriate module, based on the user selection.
    //^^^^^^^^^^^^^^^^^^^^^^^^user selection and evaluation^^^^^^^^^^^^^^^^^^^^^
    }
    
    public void addition() {
    System.out.println("addition reached");
    }
    
    public void subtraction() {
    System.out.println("subtraction reached");
    }
    
    public void multiplication() {
    System.out.println("multiplication reached");
    }
    
    public void division() {
    System.out.println("division reached");
    }
}
