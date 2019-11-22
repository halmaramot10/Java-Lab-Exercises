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
public class MaramotHActivity103LabExercise27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            int drp,dfp;
            boolean goodPressure = true;
        
            int rfp = Integer.parseInt(JOptionPane.showInputDialog("Input right front pressure"));
            
            if(rfp<35){
                JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                goodPressure = false;
            }
            else if(rfp>45){
                JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                goodPressure = false;
            }
            
            int lfp = Integer.parseInt(JOptionPane.showInputDialog("Input left front pressure"));
            
            if(lfp<35){
                JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                goodPressure = false;
            }
            else if(lfp>45){
                JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                goodPressure = false;
            }
            
            int rrp = Integer.parseInt(JOptionPane.showInputDialog("Input right rear pressure"));
        
            if(rrp<35){
                JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                goodPressure = false;
            }
            else if(rrp>45){
                JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                goodPressure = false;    
            }
           
            int lrp = Integer.parseInt(JOptionPane.showInputDialog("Input left rear pressure"));
            if(lrp<35){
                JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                goodPressure = false;
            }
            else if(lrp>45){
                JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
                goodPressure = false;
            }
            
            dfp = Math.abs(lrp-rrp);
            drp = Math.abs(lfp - rfp);
            
            if(dfp == 3 && drp == 3){
                goodPressure = true;
            }
            if(lrp == rfp && lfp == rfp){
                goodPressure = true;
            }
            else if (drp !=3 && dfp !=3){
                goodPressure = false;
            }
        
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
