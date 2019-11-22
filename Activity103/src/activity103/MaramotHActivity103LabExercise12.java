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
public class MaramotHActivity103LabExercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try{
            //initializes the logarithm
            double loga;
            
            //asks and reads the inputs 
            double x = Double.parseDouble(JOptionPane.showInputDialog("Enter a double: "));
     
            //gets the logarithm
            loga = Math.log(x)/Math.log(2);
            
            //prints the results
            JOptionPane.showMessageDialog(null,"Base 2 log of " + x + " is " + loga );
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }    
    }    
}
