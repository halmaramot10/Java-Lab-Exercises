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
public class MaramotHActivity103LabExercise22 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
        
        
        try{
            
            //asks for no of items & heating time
            int items = Integer.parseInt(JOptionPane.showInputDialog("Number of Items: "));
            
            if(items<=0){
                JOptionPane.showMessageDialog(null,"Enter a valid item!","Error",JOptionPane.WARNING_MESSAGE);
            }
            
            int heat = Integer.parseInt(JOptionPane.showInputDialog("Heating Time: "));
            //checks the number of items and determines the equivalent heating time 
            if(items==1){
                JOptionPane.showMessageDialog(null,"Recommended Heating Time: " + heat);
            }
            if(items==2){
                heat = heat + (heat/2);
                JOptionPane.showMessageDialog(null,"Recommended Heating Time: " + heat);
            }
            if(items==3){
                heat = heat*2;
                JOptionPane.showMessageDialog(null,"Recommended Heating Time: " + heat);
            }
            if(items>3){
                JOptionPane.showMessageDialog(null,"More than 3 items is not recommended!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }
}

