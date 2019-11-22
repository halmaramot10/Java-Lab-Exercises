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
public class MaramotHActivity103LabExercise13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        try{
        
            //initializes the variables
            double armean;
            double harmean;
        
            //ask and reads the value of x and y
            double x = Double.parseDouble(JOptionPane.showInputDialog("Enter X: "));
            double y = Double.parseDouble(JOptionPane.showInputDialog("Enter Y: "));
            
            //Arithmetic Mean
            armean = (x + y)/2;
            //Harmonic Mean
            harmean = 2/(1/x + 1/y);
            
            //prints the result
            JOptionPane.showMessageDialog(null,"Arithmetic Mean: " + armean +"\n"+"Harmonic Mean: " + harmean);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }    
    }    
}