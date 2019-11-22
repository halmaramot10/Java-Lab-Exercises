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
public class MaramotHActivity103LabExercise44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            int x;  
            float n= 1f;  
            double sum=1.0,term=1.0;
              
            
            x=Integer.parseInt(JOptionPane.showInputDialog("Enter value for x :  ")); 
             
                while(term >=  1.0E-12)  
                {  
                    term = term * ((float)x / n); 
                    sum = sum + term; 
                    System.out.println(" n : "+n+"    term :  "+term+"    sum :  "+sum);  
                    n++;  
                } 
            JOptionPane.showMessageDialog(null,"ex^ using sum + term =  " + sum);  
            JOptionPane.showMessageDialog(null,"e^x using Math.exp(x)=  "+ Math.exp(x));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }            
    }   
}