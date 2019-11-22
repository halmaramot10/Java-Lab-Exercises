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
public class MaramotHActivity103LabExercise26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            boolean goodPressure = true;
            int rfp = Integer.parseInt(JOptionPane.showInputDialog("Input right front pressure"));
            
                //checks the left front if in range
                if(rfp<35){
                    JOptionPane.showMessageDialog(null, "Warning: pressure is out of range");
                    goodPressure = false;
                }
                else if(rfp>45){
                    JOptionPane.showMessageDialog(null, "Warning: pressure is out of range");
                    goodPressure = false;
                }
            int lfp = Integer.parseInt(JOptionPane.showInputDialog("Input left front pressure"));
                
                //checks the left front if in range
                if(lfp<35){
                    JOptionPane.showMessageDialog(null, "Warning: pressure is out of range");
                    goodPressure = false;
                }
                else if(lfp>45){
                    JOptionPane.showMessageDialog(null, "Warning: pressure is out of range");
                    goodPressure = false;
                }
            int rrp = Integer.parseInt(JOptionPane.showInputDialog("Input right rear pressure"));
                
                //checks the right rear if in range
                if(rrp<35){
                    JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                    goodPressure = false;
                }
                else if(rrp>45){
                    JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                    goodPressure = false;   
                }
            int lrp = Integer.parseInt(JOptionPane.showInputDialog("Input left rear pressure"));
                
                //checks the left rear if in range
                if(lrp<35){
                    JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                    goodPressure = false;
                }
                else if(lrp>45){
                    JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                    goodPressure = false;
                }
                //checks if the pressure is equal
                if(lrp == rfp && lfp == rfp){
                    goodPressure = true;
                }
                else if (lrp != rrp || lfp != rrp){
                    goodPressure = false;
                }
                //checks if the tires are in good pressure
                if(goodPressure == false){
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
