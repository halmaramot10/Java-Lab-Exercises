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
public class MaramotHActivity103LabExercise34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        try{
            int n2,n3;
            int square=0;
            int cube=0;
        
            int limit = Integer.parseInt(JOptionPane.showInputDialog("Upper Limit: "));
        
            int[] sinput = new int[limit+1];
            int[] cinput = new int[limit+1];
            
            for (int i = 1; i<=limit; i++){
            
                sinput[i] = i;
                cinput[i] = i;
                square = square + (sinput[i]*sinput[i]);
                cube = cube + (cinput[i]*cinput[i]*cinput[i]);
            }
            n2 = (limit*(limit+1)*((2*limit)+1))/6;
            n3 = (limit*limit)*((limit+1)*(limit+1))/4;
            
            JOptionPane.showMessageDialog(null,"The sum of Squares is " +square 
            + "\nThe sum of Cubes is " +cube
            + "\nThe sum of Squares using n(n+1)(2n+1)/6 is:  " +n2
            + "\nThe sum of Cubes using n^2(n+1)^2/4: " +n3);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
}
