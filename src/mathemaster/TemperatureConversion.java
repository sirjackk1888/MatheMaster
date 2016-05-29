/*
 * This is the Temperature conversion module of the MatheMaster calculator
 * 
 * coded by: Kelly B Ward
 */
package mathemaster;

import java.util.*;

public class TemperatureConversion{
    
    ValidateInput runValidation = new ValidateInput();
    
    public void temperatureConversion() {
        Scanner keyboard = new Scanner(System.in);
        Double finalTemp = 0.0;
        String validatedString = "";
        System.out.println("Please enter the numeric temperature to be converted");
        double initialTemp = runValidation.validateNumericInput();
        System.out.println("Is this number Fahrenheit or Celcius? Please enter f or c");
        do {
            try {
                validatedString = (keyboard.nextLine().toLowerCase());
                
                if((validatedString.equals("c") == false)
                    && (validatedString.equals("f") == false)) {
                    throw new IllegalArgumentException(); //illegal user input will trigger an error
                } else {
                    switch(validatedString){
                        case "c":
                            finalTemp = ((initialTemp * 9/5) + 32);
                            System.out.println(initialTemp + " degrees Celcius is " + finalTemp + " degrees Fahrenheit");
                            break;
                        case "f":
                            finalTemp = ((initialTemp - 32) * 5/9);
                            System.out.println(initialTemp + " degrees Fahrenheit is " + finalTemp + " degrees Celcius");
                            break;
                    }
                }
            } catch(IllegalArgumentException e) {
                    System.out.println("Please enter the values c or f only.");
            }
        }while((validatedString.equals("c") == false)
            && (validatedString.equals("f") == false));
    }
}
