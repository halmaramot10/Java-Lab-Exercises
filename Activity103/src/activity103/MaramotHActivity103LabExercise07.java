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
public class MaramotHActivity103LabExercise07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try{ //uses try - catch to prevent invalid inputs 
            
            //initializes the variable for dollars
            int dollars;
        
            //reads the users input
            int cents = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of cents: "));
            
            //if the value of cents is less than zero, the program prints "invalid input"
            if(cents <= 0){
                JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
            }
            //else the program proceeds on the conversion of cents to dollars
            else{
                dollars = cents/100;
                cents = cents%100;
                JOptionPane.showMessageDialog(null,"That is " + dollars + " dollars and " +cents + " cents ");     
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
        }  

}
