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
public class MaramotHLab1Activity1Exercise29 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 29");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            String inputString;
            int times;
        
            System.out.println("Enter a word: ");
            inputString = dataIn.readLine();
        
            times = inputString.length();
        
            for(int i = 0; i<times;i++){
            
                System.out.println(inputString);
            }
        }catch(IOException |NumberFormatException e){
            
            System.out.println("Invalid Input! Try again.");
        }
    }
    
}
