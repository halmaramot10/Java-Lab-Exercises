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
public class MaramotHActivity103LabExercise39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        try{
            
            int exit = 1,sumout=0,sumin=0,num;
        
        
            int low = Integer.parseInt(JOptionPane.showInputDialog("In-range Adder\n" + "Low end of range: "));
        
            int high = Integer.parseInt(JOptionPane.showInputDialog("High end of range: "));
        
            while(exit == 1){
                
                num = Integer.parseInt(JOptionPane.showInputDialog("Enter data: "));
                
                if(num>=low && num<=high){
                    sumin = sumin + num;
                }
                else{
                    sumout = sumout + num;
                }
                if(num == 0){
                    JOptionPane.showMessageDialog(null,"Sum of in range values: "+sumin 
                    + "\nSum of out of range values: "+ sumout);
                    System.exit(0);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
