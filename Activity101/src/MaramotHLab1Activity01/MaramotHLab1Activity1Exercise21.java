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
public class MaramotHLab1Activity1Exercise21 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        
        System.out.println("Exercise 21 --- Steam Engine Efficiency");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
        //initializes the variable
        float efficiency;
        
        //gets the inputs needed
        System.out.println("Enter the air temperature: ");
        float Tair = Float.parseFloat(dataIn.readLine());
        System.out.println("Enter the steam temperature: ");
        float Tsteam = Float.parseFloat(dataIn.readLine());
        
        //if tsteam is less than 373K, no efficiency
        if(Tsteam<373){
            
            efficiency = 0;
            System.out.println("Efficiency: " + efficiency);
        }
        else{
            efficiency = 1 - Tair/Tsteam;
            System.out.println("Efficiency: " + efficiency);
        }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input!Try again.");
        }
    }
    
}
