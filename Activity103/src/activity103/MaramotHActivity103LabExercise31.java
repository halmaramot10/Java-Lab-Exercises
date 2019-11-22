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
public class MaramotHActivity103LabExercise31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
              
        try{
        
            int sum = 0;
            int no;
    
            no = Integer.parseInt(JOptionPane.showInputDialog("How many integers will be added: "));
            int[] integers = new int[no];
        
                for(int i = 0; i<no;i++){
            
                    integers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
            
                    sum = sum + integers[i];
                
                }
        
            JOptionPane.showMessageDialog(null,"The sum is " + sum);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }  
    }
}
