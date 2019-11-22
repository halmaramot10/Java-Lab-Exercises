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
public class MaramotHActivity103LabExercise41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int width,height,area,exit=1;
        
        
            while(exit==1){
        
                int x1 = Integer.parseInt(JOptionPane.showInputDialog("Computer Aided Design Program\n"
                + "First corner X coordinate: "));
                
                int y1 = Integer.parseInt(JOptionPane.showInputDialog("First corner Y coordinate: "));
        
                int x2 = Integer.parseInt(JOptionPane.showInputDialog("Second corner X coordinate: "));
        
                int y2 = Integer.parseInt(JOptionPane.showInputDialog("Second corner Y coordinate: "));
        
                width = Math.abs(x1-x2);
                height = Math.abs(y1-y2);
                area = width*height;
                
                JOptionPane.showMessageDialog(null,"Width: " + width + " Height: " + height + " Area: " + area);
                
                if(width == 0 || height == 0){
                    System.exit(0);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
