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
public class MaramotHLab1Activity1Exercise38 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            double miles, initial;
        
            System.out.println("Miles per Gallon Program");        
            
            System.out.println("Initial Miles: ");
            initial = Integer.parseInt(dataIn.readLine());
            if(initial<=0){
                System.out.println("bye");
            }
            while (initial !=0){
                System.out.println("Final Miles: ");
                double finals = Integer.parseInt(dataIn.readLine());
        
                if(finals <= 0){
                    System.out.println("Invalid Input!Try again.");
                    System.exit(0);
                }
                if(initial>finals){
                    System.out.println("Invalid Input!Try again.");
                    System.exit(0);
                }
                System.out.println("Gallons: ");
                int gallons = Integer.parseInt(dataIn.readLine());
        
                if(gallons <= 0){
                    System.out.println("Invalid Input!Try again.");
                    System.exit(0);
                }
                miles = (finals - initial)/gallons;
                System.out.format("Miles per Gallon: %.1f",miles);
        
                System.out.println("\nInitial Miles: ");
                initial = Integer.parseInt(dataIn.readLine());
                
                if(initial<=0){
                    System.out.println("bye");
                }
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
    
}
