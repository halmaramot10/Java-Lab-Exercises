/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaramotHLab1Activity01;

/**
 *
 * @author Hazel Anne
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaramotHLab1Activity1Exercise12 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 12");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //initializes the logarithm
            double loga;
            
            //asks and reads the inputs 
            System.out.println("Enter a double: ");
            double x = Double.parseDouble(dataIn.readLine());
     
            //gets the logarithm
            loga = Math.log(x)/Math.log(2);
            
            //prints the results
            System.out.println("Base 2 log of " + x + " is " + loga );
        
        }catch(IOException | NumberFormatException e){
            
            System.out.println("Invalid Input! Try again.");
        }
        
    }
    
}
