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
public class MaramotHActivity103LabExercise04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //initialize the variables needed 
        double sinx = 0.5236,cosx = 0.523,sum;
       
        //get the sine and cosine
        sinx = Math.sin(sinx);
        cosx = Math.cos(cosx);
        
        //gets the sum between cos2 and sin2
        sum = Math.pow(sinx,2) + Math.pow(cosx,2);
        //prints the result
        JOptionPane.showMessageDialog(null,"Given the value: 0.5236\n" + "sine: " + sinx +"\n"+ "cosine: " + cosx +"\n"+ "sum: " + sum);
    }   
}
