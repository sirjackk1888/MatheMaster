/*
 * This is the basic math module of the MatheMaster calculator
 * 
 * coded by: Kelly B Ward
 */
package mathemaster;

import static java.lang.Math.*;
import java.util.*;

public class BasicMath {
    
    ValidateInput runValidation = new ValidateInput();
    List<Double> userNumber = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);
    
    public void basicMathController() {
        int userSelection = 0;
        
        System.out.println( "Welcome to the Basic math module!" + "\n" +
                            "The current installed modules are:"
        ); // This is the header and instruction block outprinted to the user.
    //^^^^^^^^^^^^^^^^^^^^^^^^^Welcome message^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        System.out.print(   "#1: Two number Addition" + "\n" +
                            "#2: Two number Subtraction" + "\n" +
                            "#3: Two number Multiplication" + "\n" +
                            "#4: Two number Division" + "\n" +
                            "#5: Basic Area (Square or rectangle)" + "\n" +
                            "#6: Square root" + "\n" +
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
            case 5:
                area();
                break;
            case 6:
                squareRoot();
                break;
                
            
        } // This block runs the appropriate module, based on the user selection.
    //^^^^^^^^^^^^^^^^^^^^^^^^user selection and evaluation^^^^^^^^^^^^^^^^^^^^^
    }
    
    public void genericMessage() {
        System.out.println("Please enter the numbers to be converted, "
            + "enter the first number and press return, "
            + "then enter the second number and press return");
    } // generic message to get two input numbers.
    
    public void populateArray() {
        for(int i=0; i < 2; i++){
            userNumber.add(runValidation.validateNumericInput());
        }
    } // gets two user inputs and assigns them to an array for operations
    
    public void addition() {
        genericMessage();
        populateArray();
        System.out.println((userNumber.get(0)) + (userNumber.get(1)));
    }
    
    public void subtraction() {
        genericMessage();
        populateArray();
        System.out.println(((userNumber.get(0)) - (userNumber.get(1))));
    }
    
    public void multiplication() {
        genericMessage();
        populateArray();
        System.out.println(((userNumber.get(0)) * (userNumber.get(1))));
    }
    
    public void division() {
        genericMessage();
        populateArray();
        System.out.println(((userNumber.get(0)) / (userNumber.get(1))));
    }
    
    public void area() {
        System.out.println("Please enter the numbers to be converted, "
            + "enter the length measurement and press return, "
            + "then enter the height measurement and press return");
        populateArray();
        System.out.println(((userNumber.get(0)) * (userNumber.get(1))));
    }
    
    public void squareRoot() {
        System.out.println("Please enter the number to be converted, "
            + "and press return");
        System.out.println(sqrt(Double.parseDouble(keyboard.nextLine())));
    }
}
