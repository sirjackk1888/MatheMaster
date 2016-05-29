/*
 * This is the basic math module of the MatheMaster calculator
 * 
 * coded by: Kelly B Ward
 */
package mathemaster;

import java.util.*;

public class BasicMath {
    
    ValidateInput runValidation = new ValidateInput();
    List<Double> userNumber = new ArrayList<>();
    
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
    
        userSelection = runValidation.getUserSelection();
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
    
    
    public void populateArray() {
        System.out.println("Please enter the numbers to be converted, "
            + "enter the first number and press return, "
            + "then enter the second number and press return");
        
        for(int i=0; i < 2; i++){
            userNumber.add(runValidation.validateInput());
        }
    }
    public void addition() {
        populateArray();
        System.out.println((userNumber.get(0)) + (userNumber.get(1)));
    }
    
    public void subtraction() {
        populateArray();
        System.out.println(((userNumber.get(0)) - (userNumber.get(1))));
    }
    
    public void multiplication() {
        populateArray();
        System.out.println(((userNumber.get(0)) * (userNumber.get(1))));
    }
    
    public void division() {
        populateArray();
        System.out.println(((userNumber.get(0)) / (userNumber.get(1))));
    }
}
