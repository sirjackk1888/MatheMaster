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
        ValidateInput runValidation = new ValidateInput();
        int userSelection;
        System.out.println( "Welcome to the MatheMaster calculator!" + "\n" +
                            "This program will solve all manner of math based problems." + "\n" +
                            "First we need to find out what you would like to solve," + "\n" +
                            "The current installed modules are:"
        ); // This is the header and instruction block outprinted to the user.
    //^^^^^^^^^^^^^^^^^^^^^^^^^Welcome message^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        System.out.print(   "#1: Basic Math"            + "\n" +
                            "#2: Advanced Mathematics"  + "\n" +
                            "#3: Physics"               + "\n" +
                            "#4: Economics"             + "\n" +
                            "#5: Sciences"              + "\n" +
        ""); // This is the list of installed modules. 
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^Module list^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        userSelection = runValidation.getUserSelection();
    //^^^^^^^^^^^^^^^^^^^^^Get valid user selection block^^^^^^^^^^^^^^^^^^^^^^^
        
        switch(userSelection) {
            case 1:
                BasicMath runBasicMath = new BasicMath();
                runBasicMath.basicMathController();
                break;
            case 2:
                AdvancedMathematics runAdvancedMathematics = new AdvancedMathematics();
                runAdvancedMathematics.advancedMathematicsController();
                break;
            case 3:
                Physics runPhysics = new Physics();
                runPhysics.physicsController();
                break;
            case 4:
                Economics runEconomics = new Economics();
                runEconomics.economicsController();
                break;
            case 5:
                Sciences runSciences = new Sciences();
                runSciences.sciencesController();
                break;
        } // This block runs the appropriate module, based on the user selection.
    //^^^^^^^^^^^^^^^^^^^^^^^^user selection and evaluation^^^^^^^^^^^^^^^^^^^^^
    }
}

