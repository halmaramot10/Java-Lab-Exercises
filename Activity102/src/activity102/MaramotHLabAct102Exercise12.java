/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity102;

import java.io.IOException;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHLabAct102Exercise12 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main ( String[] args ) throws IOException{

        int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        
        int sum;
        
        System.out.println("Exercise 12 --- Sum of Each Row");
        
        for ( int row=0; row < data.length; row++){
        
            sum = 0;
        
        for ( int col=0; col < data[row].length; col++){
            
            sum = sum + data[row][col];
        
        }
        
        System.out.println(sum);
        
        }
    }
}