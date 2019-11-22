/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaramotHLab1Activity01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hazel Anne L. Maramot
 * BSCpE 5-5
 */
public class MaramotHLab1Activity1Exercise32 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 32");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            double sum = 0;
            
            System.out.println("Enter N: ");
            int n = Integer.parseInt(dataIn.readLine());
            
            int[] divisor = new int[n+1];
        
            for(int i =1;i<=n;i++){
            
                divisor[i] = i;
                sum = sum + (1.0/divisor[i]);
            }
            System.out.println("Sum is: " + sum);
    
        }catch(IOException | NumberFormatException | ArithmeticException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
