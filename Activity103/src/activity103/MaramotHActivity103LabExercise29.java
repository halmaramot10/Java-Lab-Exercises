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
public class MaramotHActivity103LabExercise29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            
            String inputString;
            int times;
        
            inputString = JOptionPane.showInputDialog("Enter a word: ");
        
            times = inputString.length();
        
            for(int i = 0; i<times;i++){
            
                System.out.println(inputString);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
