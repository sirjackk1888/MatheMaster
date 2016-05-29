/*
 * This is the Physics module of the MatheMaster calculator
 * 
 * coded by: Kelly B Ward
 */
package mathemaster;

public class Physics {
    
    ValidateInput runValidation = new ValidateInput();
    
    public void physicsController() {
       int userSelection = 0;
        
        System.out.println( "Welcome to the Physics module!" + "\n" +
                            "The current installed modules are:"
        ); // This is the header and instruction block outprinted to the user.
    //^^^^^^^^^^^^^^^^^^^^^^^^^Welcome message^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        System.out.print(   "#1: Kinematics" + "\n" +
        ""); // This is the list of installed modules. 
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^Module list^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        userSelection = runValidation.getUserSelection();
    //^^^^^^^^^^^^^^^^^^^^^Get valid user selection block^^^^^^^^^^^^^^^^^^^^^^^
        
        switch(userSelection) {
            case 1:
                Kinematics runKinematics = new Kinematics();
                runKinematics.kinematics();
                break;
            
        } // This block runs the appropriate module, based on the user selection.
    //^^^^^^^^^^^^^^^^^^^^^^^^user selection and evaluation^^^^^^^^^^^^^^^^^^^^^
    }
}