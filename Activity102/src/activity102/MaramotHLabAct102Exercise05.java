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
public class MaramotHLabAct102Exercise05 {

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {
        int[] val = {0, 1, 2, 3};
        int temp;
        
        System.out.println("Exercise 5 --- Reverse Order");

        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
        
        temp = val[3];
        val[3] = val[0];
        val[0] = temp;
        temp = val[1];
        val[1] = val[2];
        val[2] = temp;
         
        System.out.println( "Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
}
    
}
