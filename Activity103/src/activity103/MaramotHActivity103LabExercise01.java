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
public class MaramotHActivity103LabExercise01 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
        
        System.out.println("Exercise 1 --- Value of a Quadradic");
        //initialize the variable value and x = 4
        double value;
        double x = 4.0;
        //variable value takes the result from 3x^2 -8x + 4    
        value= 3*(Math.pow(x,2))-8*x + 4;
        //print results 
        
        JOptionPane.showMessageDialog(null, "Given: 3x^2-8x+4 \n"+"The result is " + value);
    }    
}