/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity103;

import javax.swing.JOptionPane;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHActivity103LabExercise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try{
            //asks for the input of kilowatt-hour in cents
            double cent = Double.parseDouble(JOptionPane.showInputDialog("Enter cost per kilowatt-hour in cents: "));
            //asks for the input of kilowatt-hours used per year
            int kwhours = Integer.parseInt(JOptionPane.showInputDialog("Enter kilowatt-hours used per year: "));
            
            //computes the amount of annual cost
            double amount = (cent*kwhours)/100;
        
            //prints the result
            JOptionPane.showMessageDialog(null,"Annual Cost: " + amount);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }  
}
