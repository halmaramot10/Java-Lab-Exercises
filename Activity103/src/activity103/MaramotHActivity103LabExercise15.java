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
public class MaramotHActivity103LabExercise15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
       
        try{
            //initialize the variables
            int boltPrice = 5;
            int nutPrice = 3;
            int washersPrice = 1;
            int total;
            
            //asks for the number of bolts,nuts, and washers
            int bolt = Integer.parseInt(JOptionPane.showInputDialog("Number of Bolts: "));
            int nut = Integer.parseInt(JOptionPane.showInputDialog("Number of Nuts: "));
            int washers = Integer.parseInt(JOptionPane.showInputDialog("Number of Washers: "));
        
            //gets the total amount
            total=(bolt*boltPrice)+(nut*nutPrice)+(washers*washersPrice);
        
            //check the order if bolt is grater than nut
            if (bolt>nut){
                JOptionPane.showMessageDialog(null,"Check the Order\n" + "Total: " + total);
            }
            //else,prints OK for the order
            else{
                JOptionPane.showMessageDialog(null,"Order is OK.\n" + "Total: " + total);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }    
    }    
}
