/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity102;

/**
 *
 * @author Hazel Anne
 */
import java.io.* ;
public class MaramotHLabAct102Exercise07 {

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args ) throws IOException
    {
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
        int largest1 = 0, largest2=0; 
        
        System.out.println("Exercise 7 --- Two Largest Elements");
        
        for ( int index = 0; index < data.length; index++){
                        
            if (data[index]>largest1){
                largest1=data[index];
            }
            if (data[index]>largest2 && data[index]<largest1){
                largest2 = data[index];
            }
        
        }
        // write out the two largest
        System.out.println("The first largest element: " + largest1);
        System.out.println("The first largest element: " + largest2);
        }
}
