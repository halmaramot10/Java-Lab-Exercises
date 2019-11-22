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
public class MaramotHActivity103LabExercise17 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
        
        
        
        try{
            //ask for the weight
            int cpounds = Integer.parseInt(JOptionPane.showInputDialog("Enter your pounds: "));
            
            //checks whether the weight is qualified for heavyweight
            if(cpounds>=220 && cpounds<=280){
                JOptionPane.showMessageDialog(null,"Your'e allowed in the contest!");
            }
            else{
                JOptionPane.showMessageDialog(null,"You're not allowed in the contest!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }  
    }
    
}