/*
 * Welcome to the MatheMaster calculator.
 * This program will help you with multiple math based problems.
 * 
 * Coded by: Kelly B Ward
 * 
 * To add a module, ensure that is it listed in the module list, 
 * and that the corresponding selection is in the case selector.
 */

package mathemaster;

import java.util.*;

public class MatheMaster {

    public static void main(String[] args) {
        int userSelection = 0,
            returnVariable;
        
        System.out.println( "Welcome to the MatheMaster calculator!" + "\n" +
                            "This program will solve all manner of math based problems." + "\n" +
                            "First we need to find out what you would like to solve," + "\n" +
                            "The current installed modules are:"
        ); // This is the header and instruction block outprinted to the user.
    //^^^^^^^^^^^^^^^^^^^^^^^^^Welcome message^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        System.out.print(   "#1: Basic math" + "\n" +
                            "#2: Geometry" + "\n" +
        ""); // This is the list of installed modules. 
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^Module list^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        do {
            System.out.println("Please enter the number for the module you would like to use");
            Scanner keyboard = new Scanner(System.in);
            try {
                userSelection = Integer.parseInt(keyboard.nextLine());
                returnVariable = 1;
                } catch(NumberFormatException e) {
                    System.out.println("Invalid input detected");
                    returnVariable = 0;
                } 
        }while(returnVariable == 0); // this try/catch block gets the user selection and converts to a numeric value.
    //^^^^^^^^^^^^^^^^^^^^^Get valid user selection block^^^^^^^^^^^^^^^^^^^^^^^
        
        switch(userSelection) {
            case 1:
                BasicMath runBasicMath = new BasicMath();
                runBasicMath.basicMath();
                break;
            case 2:
                Geometry runGeometry = new Geometry();
                runGeometry.geometry();
                break;
        } // This block runs the appropriate module, based on the user selection.
    //^^^^^^^^^^^^^^^^^^^^^^^^user selection and evaluation^^^^^^^^^^^^^^^^^^^^^
    }
}

