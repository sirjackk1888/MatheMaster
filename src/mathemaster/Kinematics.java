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
                            "All measurements are in Meters and Meters per second" + "\n" +
                            "Please enter any availalbe information for the following variables:" + "\n" +
                            "enter 000 for any unknown variables");
    //^^^^^^^^^^^^^^^^^^^Kinematic welcome message and instruction^^^^^^^^^^^^^^
        
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
    //^^^^^^^^^^^^^^^^^^^^^^^^get user input^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        if(functionIdentifier.contains("1") && functionIdentifier.contains("2")){
            acceleration();
            displacement();
        } 
        if(functionIdentifier.contains("1") && functionIdentifier.contains("3")){
            time();
            acceleration();
        }
        if(functionIdentifier.contains("1") && functionIdentifier.contains("4")){
            velocityInitial();
            acceleration();
        }
        if(functionIdentifier.contains("1") && functionIdentifier.contains("5")){
            accelerationWithoutVf();
            velocityFinal();
        }
        if(functionIdentifier.contains("2") && functionIdentifier.contains("3")){
            displacementWithoutTime();
            time();
        }
        if(functionIdentifier.contains("2") && functionIdentifier.contains("4")){
            velocityInitial();
            displacement();
        }
        if(functionIdentifier.contains("2") && functionIdentifier.contains("5")){
            displacement();
            velocityFinal();
        }
        if(functionIdentifier.contains("3") && functionIdentifier.contains("4")){
            System.out.println("Cannot find time without the initial velocity" + "\n" +
                                "Initial velocity set to 0");
            Vi = 0;
            time();
        }
        if(functionIdentifier.contains("3") && functionIdentifier.contains("5")){
            VfWithoutTime();
            time();
        }
        if(functionIdentifier.contains("4") && functionIdentifier.contains("5")){
            ViWithoutVf();
            velocityFinal();
        }
        
        if(functionIdentifier.size() == 1) {
            if(functionIdentifier.contains("1")){
                acceleration();
            }
            if(functionIdentifier.contains("2")){
                displacement();
            }
            if(functionIdentifier.contains("3")){
                time();
            }
            if(functionIdentifier.contains("4")){
                velocityInitial();
            }
            if(functionIdentifier.contains("5")){
                velocityFinal();
            }
        }
        
        finalDisplay();
    }
    //^^^^^^^^^^^^^^^select function based on available variables^^^^^^^^^^^^^^^
    
    public void acceleration() {
        a = ((Vf - Vi) / t);
    }
    
    public void displacement() {
        d = ((Vi * t) + (1/2 * (Math.pow(a * t, 2))));
    }
    
    public void time() {
        t = ((Vf - Vi) / a);
    }
    
    public void velocityInitial() {
        Vi = (Vf - (a * t));
    }
    
    public void velocityFinal() {
        Vf = (Vi + (a * t));
    }
    
    public void accelerationWithoutVf() {
        a = (d - (Vi * t)) / (.5 * (Math.pow(t, 2)));
    }
    
    public void displacementWithoutTime() {
        d = (((Math.pow(Vf, 2)) - (Math.pow(Vi, 2))) / (2 * a));
    }
    
    public void VfWithoutTime() {
        Vf = Math.sqrt((Math.pow(Vi, 2) + (2 * a * d)));
    }
    
    public void ViWithoutVf() {
        Vi = ((d - (.5 * a * (Math.pow(t, 2)))) / t);
    }
    //^^^^^^^^^^^^^kinematic functions^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
    public void finalDisplay() {
        System.out.print("Average acceration is: " + a + " Meters per second" + "\n" +
                           "Displacement is: " + d + " Meters " + "\n" +
                           "Time is: " + t + " Seconds " + "\n" +
                           "Initial velocity is: " + Vi + " Meters per second "+ "\n" +
                           "Final velocity is: " + Vf + " Meters per second "+ "\n" +
        "");
    }
    //^^^^^^^^^^^^^^final display^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
}

