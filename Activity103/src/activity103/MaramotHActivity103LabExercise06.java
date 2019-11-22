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
public class MaramotHActivity103LabExercise06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try{
            //Asking for the input radius
            int r = Integer.parseInt(JOptionPane.showInputDialog("Input the radius: "));
        
            //formula for area of circle
            double area = Math.pow(r,2)*Math.PI;
        
            //print the results
            JOptionPane.showMessageDialog(null,"The radius is: " + r +"\n" + "The area is:  " + area);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        } 
    }  
}