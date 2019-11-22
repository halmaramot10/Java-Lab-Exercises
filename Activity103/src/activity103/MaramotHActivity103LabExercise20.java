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
public class MaramotHActivity103LabExercise20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        try{
            //initializes the variable 
            double ship;
            double total;
            double rem;
            
            //ask for inputs needed
            String itemname = JOptionPane.showInputDialog("Enter the item: ");
            int price = Integer.parseInt(JOptionPane.showInputDialog("Enter the price: "));
            int deli = Integer.parseInt(JOptionPane.showInputDialog("Overnight delivery (0==no, 1==yes)"));
            
            //gets the price
            rem = price/100.00;
        
            //for less than 10 dollars
            if(rem<10){
                ship = 2.0;
                switch(deli){
                    case 0: //for daytime delivery
                        total = rem + ship;
                        JOptionPane.showMessageDialog(null,itemname +" " + rem + "\nshipping " + ship + "\ntotal: " + total);
                    break;
                    case 1: //for overnight delivery
                        ship = ship + 5.00;
                        total = rem + ship;
                        JOptionPane.showMessageDialog(null,itemname +" " + rem + "\nshipping " + ship + "\ntotal: " + total);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null,"Invalid Input!","Error!",JOptionPane.WARNING_MESSAGE);
                    break;
                }    
            }
            //for more than 10 dollars
            else if(price>10){
                ship = 3.0;
                switch(deli){
                    case 0: //for daytime
                        total = rem + ship;
                        JOptionPane.showMessageDialog(null,itemname +" " + rem + "\nshipping " + ship + "\ntotal: " + total);
                    break;
                    case 1: //for overnight
                        ship = ship + 5.00;
                        total = rem + ship;
                        JOptionPane.showMessageDialog(null,itemname +" " + rem + "\nshipping " + ship + "\ntotal: " + total);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null,"Invalid Input!","Error!",JOptionPane.WARNING_MESSAGE);
                    break;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }  
    }    
}

