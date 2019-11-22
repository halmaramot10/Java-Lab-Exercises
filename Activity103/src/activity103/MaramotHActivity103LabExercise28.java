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
public class MaramotHActivity103LabExercise28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            int i;
            
            int start = Integer.parseInt(JOptionPane.showInputDialog("Enter Start: "));
       
            int end = Integer.parseInt(JOptionPane.showInputDialog("Enter End: "));
        
            while(start<=end){
                System.out.println(start++);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
        
    }
}
