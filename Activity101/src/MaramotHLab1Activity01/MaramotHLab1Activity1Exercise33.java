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
public class MaramotHLab1Activity1Exercise33 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
   public static void main(String[] args) throws IOException {
        
       System.out.println("Exercise 33");
       BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            float sum = 0,square = 0,avg,savg,avgSquare,SD;
        
            System.out.println("How many numbers of N are to follow: ");
            int N = Integer.parseInt(dataIn.readLine());
        
            float[] n = new float [N];
            for(int i = 0;i<N;i++){
            
                System.out.println("Enter an integer: ");
                n[i] = Float.parseFloat(dataIn.readLine());
            
                sum = sum + n[i];
                square = square + n[i]*n[i];
            }
        
            avg = sum/N;
            savg = (float) Math.pow(avg,2);
            avgSquare = square/N;
            SD = (float) Math.sqrt(avgSquare - savg);
        
        System.out.println("Standard Deviation is: "+SD);
        
        }catch(IOException | NumberFormatException | ArithmeticException e){
            System.out.println("Invalid Input! Try again.");
        }
    }   
}
