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
public class MaramotHLabAct102Exercise08ver1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int t;
        
        System.out.println("Exercise 8 --- Reversal of Elements version 1");
        
        for ( int j=0; j<data.length/2; j++){
        
            t = data[j];
            data[j]=data[data.length - j - 1];
            data[data.length - j - 1] = t;
        
        }
        for ( int j=0; j < data.length; j++){
            
            System.out.println(data[j]);
        
        }
}
    
}
