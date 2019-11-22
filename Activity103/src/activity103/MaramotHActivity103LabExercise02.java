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
public class MaramotHActivity103LabExercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
        double[] value = new double [3];
        double x[] = {0.0,2.0,4.0};
        //when x = 0.0
        value[0] = 3*(Math.pow(x[0],2))-8*x[0] + 4;
        //when x = 2.0
        value[1] = 3*(Math.pow(x[1],2))-8*x[1] + 4;
        //when x = 4.0
        value[2] = 3*(Math.pow(x[2],2))-8*x[2] + 4;
        /*
            The program takes the assigned value in variable x and substitutes it to the
            equation 3x^2 - 8x + 4 then prints the results
        */
        JOptionPane.showMessageDialog(null,"Given: 3x^2-8x+4\n" 
        + "At x = " + x[0] + ", the result is " +value[0] +"\n"
        + "At x = " + x[1] + ", the result is " +value[1] +"\n"
        + "At x = " + x[2] + ", the result is " +value[2]);
    }   
    
}
