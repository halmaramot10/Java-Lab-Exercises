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
public class MaramotHActivity103LabExercise09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try{
            //asks for voltage
            int v = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of voltage: "));
            //asks for resistance
            int r = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of resistance: "));
            //computes and print the result
            double I = (v + 0.0)/r;
            JOptionPane.showMessageDialog(null,"The amount of current is: " + I);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }
}
