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
public class MaramotHActivity103LabExercise36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
            int nstar = Integer.parseInt(JOptionPane.showInputDialog("Initial number of stars: "));
         
                for (int i = nstar; i >= 1; i--) { 
                    System.out.print("\n"); 
	   		for (int a = 1;  a <= i; a++) { 
	   			System.out.print("*");
	   		}
	   }
            System.out.println("");
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
}
