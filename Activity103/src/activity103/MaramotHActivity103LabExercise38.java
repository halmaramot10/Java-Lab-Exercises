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
public class MaramotHActivity103LabExercise38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            double miles, initial;
        
            initial = Integer.parseInt(JOptionPane.showInputDialog("Miles per Gallon Program\n" 
            + "Initial Miles: "));
            if(initial<=0){
                JOptionPane.showMessageDialog(null,"bye");
            }
            while (initial !=0){
     
                double finals = Integer.parseInt(JOptionPane.showInputDialog("Final Miles: "));
        
                if(finals <= 0){
                    JOptionPane.showMessageDialog(null,"Invalid Input!Try again.");
                    System.exit(0);
                }
                if(initial>finals){
                    JOptionPane.showMessageDialog(null,"Invalid Input!Try again.");
                    System.exit(0);
                }
                int gallons = Integer.parseInt(JOptionPane.showInputDialog("Gallons: "));
        
                if(gallons <= 0){
                    JOptionPane.showMessageDialog(null,"Invalid Input!Try again.");
                    System.exit(0);
                }
                miles = (finals - initial)/gallons;
                JOptionPane.showMessageDialog(null,"Miles per Gallon: "+ miles);
        
                initial = Integer.parseInt(JOptionPane.showInputDialog("\nInitial Miles: "));
                
                if(initial<=0){
                    JOptionPane.showMessageDialog(null,"bye");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
