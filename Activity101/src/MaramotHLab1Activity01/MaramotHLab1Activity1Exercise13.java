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
import java.io.InputStreamReader;
import java.io.IOException;

public class MaramotHLab1Activity1Exercise13 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 13");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
        
            //initializes the variables
            double armean;
            double harmean;
        
            //ask and reads the value of x and y
            System.out.println("Enter X: ");
            double x = Double.parseDouble(dataIn.readLine());
            System.out.println("Enter Y: ");
            double y = Double.parseDouble(dataIn.readLine());
            
            //Arithmetic Mean
            armean = (x + y)/2;
            //Harmonic Mean
            harmean = 2/(1/x + 1/y);
            
            //prints the result
            System.out.println("Arithmetic Mean: " + armean);
            System.out.println("Harmonic Mean: " + harmean);
            
        }catch(IOException | NumberFormatException e){
            
            System.out.println("Invalid Input. Try again.");
        }
    
}
    
}