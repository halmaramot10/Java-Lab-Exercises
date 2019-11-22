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
public class MaramotHActivity103LabExercise32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Exercise 32");
        
        try{
            
            double sum = 0;
            
            System.out.println("Enter N: ");
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter N: "));
            
            int[] divisor = new int[n+1];
        
            for(int i =1;i<=n;i++){
            
                divisor[i] = i;
                sum = sum + (1.0/divisor[i]);
            }
            JOptionPane.showMessageDialog(null,"Sum is: " + sum);
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
}

