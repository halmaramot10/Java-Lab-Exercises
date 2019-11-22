/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity102;

import java.io.*;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHLabAct102Exercise08ver2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main ( String[] args ) throws IOException{
        
        int t;
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] result = new int [14];
        
        System.out.println("Exercise 8 --- Reversal of Elements version 2");
        
        for ( int j=0; j<data.length; j++){
            t = data[j];
            result[j]=data[data.length - j - 1];
            data[data.length - j - 1] = t;
            
        }
        for ( int j=0; j < data.length; j++){
            System.out.print(result[j] + " ");
        }
        System.out.println();
    }
}
