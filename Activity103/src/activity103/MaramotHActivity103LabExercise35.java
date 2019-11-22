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
public class MaramotHActivity103LabExercise35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            double xn = 1;
        
            double x = Double.parseDouble(JOptionPane.showInputDialog("Enter X: "));
            
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter N: "));
            
            if (n<=0){
                JOptionPane.showMessageDialog(null,"N must be a positive integer.");
            }
            
            else{
                for (int i = 0;i<n;i++){
                    xn = xn*x;
                }
                JOptionPane.showMessageDialog(null,x + " raised to the power " + n + " is: "+xn);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
}
