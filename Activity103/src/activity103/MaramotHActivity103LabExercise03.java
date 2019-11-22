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
public class MaramotHActivity103LabExercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //initialize the variables
        double april = 12,may = 14,june = 8,avg;
        
        //get the average
        avg = (april+may+june)/3;
        
        //prints the results
        JOptionPane.showMessageDialog(null, "Rainfall for April: \t" + april
        + "\nRainfall for May: \t" + may + "\nRainfall for June:\t" + june
        + "\nAverage Rainfall: \t" + avg);
    }   
}