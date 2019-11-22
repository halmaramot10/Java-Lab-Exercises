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
public class MaramotHActivity103LabExercise30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Exercise 30");
        
        try{
            
            String first = JOptionPane.showInputDialog("Enter the first word: ");
            String second = JOptionPane.showInputDialog("Enter the second word: ");
        
            int flength = first.length();
            int slength = second.length();
        
            int length = 30 - (flength + slength);
        
            System.out.print(first);
                for(int i = 0; i<length;i++){
                    System.out.print(".");
                }
            System.out.println(second);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }        
    }        
}
