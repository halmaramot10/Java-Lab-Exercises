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
public class MaramotHActivity103LabExercise21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        
        try{
        //initializes the variable
        float efficiency;
        
        //gets the inputs needed
        float Tair = Float.parseFloat(JOptionPane.showInputDialog("Enter the air temperature: "));
        float Tsteam = Float.parseFloat(JOptionPane.showInputDialog("Enter the steam temperature: "));
        
        //if tsteam is less than 373K, no efficiency
        if(Tsteam<373){
            
            efficiency = 0;
            JOptionPane.showMessageDialog(null,"Efficiency: " + efficiency);
        }
        else{
            efficiency = 1 - Tair/Tsteam;
            JOptionPane.showMessageDialog(null,"Efficiency: " + efficiency);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }  
    }
    
}

