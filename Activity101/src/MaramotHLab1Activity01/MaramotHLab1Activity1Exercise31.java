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
public class MaramotHLab1Activity1Exercise31 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 31 --- Adding up Integers");
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
        
            int sum = 0;
            int no;
    
            System.out.println("How many integers will be added: ");
            no = Integer.parseInt(dataIn.readLine());
            int[] integers = new int[no];
        
                for(int i = 0; i<no;i++){
            
                    System.out.println("Enter an integer: ");
                    integers[i] = Integer.parseInt(dataIn.readLine());
            
                    sum = sum + integers[i];
                
                }
        
            System.out.println("The sum is " + sum);
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
