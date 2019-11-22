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
public class MaramotHActivity103LabExercise23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            //asks for the player's name
            String name = JOptionPane.showInputDialog("Welcome to Yertle's Quest" + "\nEnter the name of your character: ");
        
            //enter the statistics
            int strength = Integer.parseInt(JOptionPane.showInputDialog("Enter strength: "));
            int health = Integer.parseInt(JOptionPane.showInputDialog("Enter health: "));
            int luck = Integer.parseInt(JOptionPane.showInputDialog("Enter luck: "));
        
            //checks if the stats exceeds 15 or not
            if ((strength + health + luck)>15){
                strength = 5;
                health = 5;
                luck = 5;
                JOptionPane.showMessageDialog(null,"You have give your character too many points! Default values have been assigned: " 
                + name + ", strength: " + strength +", " + "health: " + health + ", " + "luck: " + " "  + luck);
            }
            else{
                JOptionPane.showMessageDialog(null,name + ", strength: " + strength +", " + "health: " + health + ", " + "luck: " + " "  + luck);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
}
