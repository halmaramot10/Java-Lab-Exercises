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

public class MaramotHLabAct102Exercise06 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main ( String[] args ) throws IOException{
    
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
        
        int sumall = 0, sumodd=0,sumeven=0;
        
        System.out.println("Exercise 6 --- Sum of Even, Odd, and All Elements");
        
        for ( int index=0; index < data.length; index++){
            
            sumall = sumall + data[index];
            if(data[index]%2 == 0){
                sumeven = sumeven + data[index];
            }
            else{
                sumodd = sumodd + data[index];
            }
        }
        System.out.println("The sum of all is: " + sumall);
        System.out.println("The sum of all odd numbers is: " + sumodd);
        System.out.println("The sum of all even numbers is: " + sumeven);
    }
}
