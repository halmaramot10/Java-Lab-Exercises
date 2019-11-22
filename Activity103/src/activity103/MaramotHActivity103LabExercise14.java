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
public class MaramotHActivity103LabExercise14 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args){
        
        
        try{
            
            //asks for amount of purchases
            int cent = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of purchases: "));
            int discount;
            //checks whether the cent>100, a 10% discount will apply
            if (cent>1000){
            
                discount = cent - (cent*10)/100;
                JOptionPane.showMessageDialog(null,"Discounted Price: " + discount);
            
            }
            //else, no discount
            else{
               
                JOptionPane.showMessageDialog(null,"Discounted Price: 0");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }    
    }    
}