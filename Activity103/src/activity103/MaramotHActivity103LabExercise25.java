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
public class MaramotHActivity103LabExercise25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            //front pressure
            int rfp = Integer.parseInt(JOptionPane.showInputDialog("Input right front pressure"));
            int lfp = Integer.parseInt(JOptionPane.showInputDialog("Input left front pressure"));
        
            //rear pressure
            int rrp = Integer.parseInt(JOptionPane.showInputDialog("Input right rear pressure"));
            int lrp = Integer.parseInt(JOptionPane.showInputDialog("Input left rear pressure"));
        
            if(lfp != rfp || lrp != rrp ){
                JOptionPane.showMessageDialog(null,"Inflation is BAD!");
            
            }
            else{
                JOptionPane.showMessageDialog(null,"Inflation is OK!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
}

