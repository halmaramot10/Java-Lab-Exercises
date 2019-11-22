/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity103;

/**
 *
 * @author Hazel Anne
 */
import javax.swing.*;
public class MaramotHActivity103LabExercise16 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
        
        
        //initializes the variable gas
        double gas;
        int gage,tank,miles;
        
        try{
            //ask for the inputs needed
            tank = Integer.parseInt(JOptionPane.showInputDialog("Tank Capacity: "));
            
            gage = Integer.parseInt(JOptionPane.showInputDialog("Gage Reading: "));
            
            miles = Integer.parseInt(JOptionPane.showInputDialog("Miles per Gallon: "));
        
            if (gage == 0){
            
                JOptionPane.showMessageDialog(null,"Get Gas!");
                System.exit(0);
            }
            if(gage == 0 | gage == 25 | gage == 50 | gage == 75 | gage == 100){        
            
                //converts the percent to whole number
                gage = gage/25;
                //gets the equivalent amount of gas based on the percent
                tank = tank/gage;
                //checks if the car has a capacity to go to 200 miles
                gas = tank*miles;
       
                //if the car cant reach the 200 miles, get gas
                if(gas<200){
                    JOptionPane.showMessageDialog(null,"Get Gas!");
                }
                //else the car can proceed now
                else{
                    JOptionPane.showMessageDialog(null,"Safe to Proceed");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid gage reading!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }    
    }    
}
