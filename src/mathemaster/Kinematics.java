/*
 * This is the Kinematics module of the MatheMaster calculator
 * 
 * coded by: Kelly B Ward
 */
package mathemaster;

import java.util.*;

public class Kinematics {
    
    double a, d, t, Vi, Vf;
    ValidateInput runValidation = new ValidateInput();
    Scanner keyboard = new Scanner(System.in);
    List<String> functionIdentifier = new ArrayList<>();
    
    public void kinematics() {
        System.out.println( "This moodule will help describe an object's motion." + "\n" +
                            "Please enter any availalbe information for the following variables:" + "\n" +
                            "enter 000 for any unknown variables");
        
        System.out.print("Accerleration" + "\n" +
                         "a = ");
        a = runValidation.validateNumericInput();
        if(a == 000) {
            functionIdentifier.add("1");
        }
        System.out.print("Displacement (or distance)" + "\n" +
                         "d = ");
        d = runValidation.validateNumericInput();
        if(d == 000) {
            functionIdentifier.add("2");
        }
        System.out.print("time" + "\n" +
                         "t = ");
        t = runValidation.validateNumericInput();
        if(t == 000) {
            functionIdentifier.add("3");
        }
        System.out.print("Velocity (initial)" + "\n" +
                         "Vi = ");
        Vi = runValidation.validateNumericInput();
        if(Vi == 000) {
            functionIdentifier.add("4");
        } 
        System.out.print("Velocity (final)" + "\n" +
                         "Vf = ");
        Vf = runValidation.validateNumericInput();
        if(Vf == 000) {
            functionIdentifier.add("5");
        }
        
        switch(List.toArray(functionIdentifier)) { 
            case "[1, 2]":
                System.out.println("case one reached");
                break;
                
        }
    }
}

