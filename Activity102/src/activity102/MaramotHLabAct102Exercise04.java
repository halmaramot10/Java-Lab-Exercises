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
public class MaramotHLabAct102Exercise04 {

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {
        
        int[] valA = { 13, -22, 82, 17};
        int[] valB = { 0, 0, 0, 0};
        
        System.out.println("Exercise 4 --- Same Sum");
        
        valB[0] = 12;
        valB[1] = 47;
        valB[2] = -57;
        valB[3] = 8;
        
        System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
        System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );
        System.out.println( "sum: " + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
}
    
}
