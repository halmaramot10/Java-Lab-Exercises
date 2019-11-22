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
public class MaramotHLabAct102Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {
        int[] valA = { 13, -22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum = {0,0,0,0};
        
        System.out.println("Exercise 3 --- Three Arrays");
        
        sum[0] = valA[0] + valB[0];
        sum[1] = valA[1] + valB[1];
        sum[2] = valA[2] + valB[2];
        sum[3] = valA[3] + valB[3];
        
        System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
}
