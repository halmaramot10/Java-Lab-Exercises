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
public class MaramotHActivity103LabExercise08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        
        try{
            
            //asks for the value of change 
            int cents = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of change: "));
            
            //if change is less than or equal to zero, invalid input
            if(cents<=0){
                JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
            }
            
            //takes the value of dollars and puts the remainder in cents 
            int dollars = cents/100;
            cents = cents%100;
            
            //takes the value of quarters and puts the remainder in cents
            int quarters = cents/25;
            cents = cents%25;
            
            //takes the value of dime and puts the remainder in cents
            int dime = cents/10;
            cents = cents%10;
            
            //takes the value of nickels and puts the remainder in cents
            int nickel = cents/5;
            cents = cents%5;
            
            //prints the results
            JOptionPane.showMessageDialog(null,"Your change is: " + dollars 
            + " dollar " + quarters + " quarters " + dime + " dime "
            + nickel +" nickel and " + cents +" cents." );
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
}