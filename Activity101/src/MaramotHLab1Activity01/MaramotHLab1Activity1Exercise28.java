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
public class MaramotHLab1Activity1Exercise28 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 28");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int i;
            
            System.out.println("Enter Start: ");
            int start = Integer.parseInt(dataIn.readLine());
            
            System.out.println("Enter End: ");
            int end = Integer.parseInt(dataIn.readLine());
        
            while(start<=end){
                System.out.println(start++);
            }
            
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
        
    }
}
