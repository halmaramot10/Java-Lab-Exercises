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
public class MaramotHActivity103LabExercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){        
        
        try{
            //initializes the variable
            double d;
            double g = 32.174;
            
            //ask for number of seconds
            double t = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of seconds: "));
            
            //gets the distance
            d = (g*Math.pow(t,2))/2;
            
            //prints the result
            JOptionPane.showMessageDialog(null,"Distance: " + d + " feet");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }
}
