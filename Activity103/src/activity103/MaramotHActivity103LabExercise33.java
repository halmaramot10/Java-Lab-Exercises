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
public class MaramotHActivity103LabExercise33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            float sum = 0,square = 0,avg,savg,avgSquare,SD;
        
            int N = Integer.parseInt(JOptionPane.showInputDialog("How many numbers of N are to follow: "));
        
            float[] n = new float [N];
            for(int i = 0;i<N;i++){
            
                n[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter an integer: "));
            
                sum = sum + n[i];
                square = square + n[i]*n[i];
            }
        
            avg = sum/N;
            savg = (float) Math.pow(avg,2);
            avgSquare = square/N;
            SD = (float) Math.sqrt(avgSquare - savg);
        
        JOptionPane.showMessageDialog(null,"Standard Deviation is: "+SD);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }   
}
