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
public class MaramotHActivity103LabExercise40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            double total,weight;
            
            weight = Integer.parseInt(JOptionPane.showInputDialog("Weight of Order: "));
        
            if (weight<=0){
                JOptionPane.showMessageDialog(null,"bye");
            }
            while(weight>0){
                
                if(weight<=10){
                    total = 3.0;
                }
            else{
                total = 3.0 +((weight-10)*0.25);
            }
            JOptionPane.showMessageDialog(null,"Shipping Cost:$" + total);
       
            weight = Integer.parseInt(JOptionPane.showInputDialog("\nWeight of Order: "));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
}
