/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity102;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHLabAct102Exercise13 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
   public static void main ( String[] args ) throws IOException{

        int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
            
        int length = 0;
        
        System.out.println("Exercise 13 --- Sum of Each Column");
        
        for (int row = 0; row < data.length; row++) {
            length = data[row].length;
        }
            
        int[] sums = new int[length];
            
        Arrays.fill(sums, 0);

        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                
                sums[col] += data[row][col];
            } 
        }   
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
        }
    }
}