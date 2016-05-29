/*
 * This is the input validation block of the MatheMaster calculator
 * 
 * coded by: Kelly B Ward
 */
package mathemaster;

import java.util.*;

public class ValidateInput {
    
    Scanner keyboard = new Scanner(System.in);
    int userSelection = 0,
        returnVariable;
    double validatedNumber = 0;
    String validatedString = "";
    
    public int getUserSelection() {
        do {
            System.out.println("Please enter the number for the module you would like to use");
            try {
                userSelection = Integer.parseInt(keyboard.nextLine());
                returnVariable = 1; // loop controller
                } catch(NumberFormatException e) {
                    System.out.println("Invalid input detected"); // format error message
                    returnVariable = 0; // loop controller
                } 
        }while(returnVariable == 0); 
        return userSelection; // returns the userselection as a variable to the appropriate controller
    }
    
    public double validateNumericInput() {
        do {
            try {
                validatedNumber = Double.parseDouble(keyboard.nextLine());
                returnVariable = 1; // loop controller
                } catch(NumberFormatException e) {
                    System.out.println("Invalid input detected, Please enter a number only"); // format error message
                    returnVariable = 0; // loop controller
                } 
        }while(returnVariable == 0); 
        return validatedNumber; // validates the numeric entries and returns the appropriate double.
    }
    
    public String validateStringInput() {
        do {
            try {
                validatedString = (keyboard.nextLine().toLowerCase());
                
                if((validatedString.equals("c") == false)
                    && (validatedString.equals("f") == false)) {
                    throw new IllegalArgumentException(); //illegal user input will trigger an error
                   }
                } catch(IllegalArgumentException e) {
                    System.out.println("Please enter the values c or f only.");
                }
        }while((validatedString.equals("c") == false)
                    && (validatedString.equals("f") == false));
        return validatedString;
    }
}
