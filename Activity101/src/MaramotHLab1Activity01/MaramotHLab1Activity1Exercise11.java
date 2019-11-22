/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaramotHLab1Activity01;

/**
 *
 * @author Hazel Anne L. Maramot
 * BSCpE 5-5
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaramotHLab1Activity1Exercise11 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 11");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //initializes the variable
            double d;
            double g = 32.174;
            
            //ask for number of seconds
            System.out.println("Enter the number of seconds: ");
            double t = Double.parseDouble(dataIn.readLine());
            
            //gets the distance
            d = (g*Math.pow(t,2))/2;
            
            //prints the result
            System.out.println("Distance: " + d + " feet");
            
        }catch(IOException | NumberFormatException e){
            
            System.out.println("Invalid Input! Try again.");
        
        }
    }
}