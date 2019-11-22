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
public class MaramotHActivity103LabExercise24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            //asks for checking and savings account
            int checka = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of Checking Account in $: "));
            int savea = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of Savings Account in $: "));
                
                //checks whether the savings or checking for service charge 
                if (savea>1500 || checka>1000 ){
            
                    JOptionPane.showMessageDialog(null,"Service Charge: $0");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Service Charge: $0.15");
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }
}
