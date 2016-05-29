/*
 * This is the advanced math module of the MatheMaster calculator
 * 
 * coded by: Kelly B Ward
 */
package mathemaster;

public class AdvancedMathematics {
    
    ValidateInput runValidation = new ValidateInput();
    
    public void advancedMathematicsController() {
        int userSelection = 0;
        
        System.out.println( "Welcome to the Advanced mathematics module!" + "\n" +
                            "The current installed modules are:"
        ); // This is the header and instruction block outprinted to the user.
    //^^^^^^^^^^^^^^^^^^^^^^^^^Welcome message^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        System.out.print(   "#1: Geometry" + "\n" +
                            "#2: Algebra" + "\n" +
                            "#3: Trigonometry" + "\n" +
                            "#4: Calculus" + "\n" +
                            "#5: Statistics" + "\n" +
        ""); // This is the list of installed modules. 
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^Module list^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
        userSelection = runValidation.getUserSelection();
    //^^^^^^^^^^^^^^^^^^^^^Get valid user selection block^^^^^^^^^^^^^^^^^^^^^^^
        
        switch(userSelection) {
            case 1:
                Geometry runGeometry = new Geometry();
                runGeometry.geometry();
                break;
            case 2:
                Algebra runAlgebra = new Algebra();
                runAlgebra.algebra();
                break;
            case 3:
                Trigonometry runTrigonometry = new Trigonometry();
                runTrigonometry.trigonometry();
                break;
            case 4:
                Calculus runCalculus = new Calculus();
                runCalculus.calculus();
                break;
            case 5:
                Statistics runStatistics = new Statistics();
                runStatistics.statistics();
                break;
            
        } // This block runs the appropriate module, based on the user selection.
    //^^^^^^^^^^^^^^^^^^^^^^^^user selection and evaluation^^^^^^^^^^^^^^^^^^^^^
    }
}