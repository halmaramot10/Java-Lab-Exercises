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
public class MaramotHActivity103LabExercise18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        try{
            
            //initializes the variables
            double packa;
            double packb;
        
            //asks for prices and percent
            double pricea = Double.parseDouble(JOptionPane.showInputDialog("Price per pound package A:  "));
            double percenta = Double.parseDouble(JOptionPane.showInputDialog("Percent lean package A:  "));
            double priceb = Double.parseDouble(JOptionPane.showInputDialog("Price per pound package B:  "));
            double percentb = Double.parseDouble(JOptionPane.showInputDialog("Percent lean package B:  "));
        
            //takes the prices for pack a and b
            packa = pricea/(percenta*0.01);
            packb = priceb/(percentb*0.01);
        
            //prints the prices
            JOptionPane.showMessageDialog(null,"Package A cost per pound of lean: " + packa +"\nPackage B cost per pound of lean: " + packb);
        
            //comparison between pack a and b
            if (packa<packb && packa != packb){
                JOptionPane.showMessageDialog(null,"Package A is the best value");       
            }
            else if (packa>packb && packa != packb){
                JOptionPane.showMessageDialog(null,"Package B is the best value");
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }  
    }
    
}
