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
public class MaramotHLab1Activity1Exercise14 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 14 --- Discount Prices");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //initializes the variables
            int discount;
            
            //asks for amount of purchases
            System.out.println("Enter the amount of purchases: ");
            int cent = Integer.parseInt(dataIn.readLine());
        
            //checks whether the cent>100, a 10% discount will apply
            if (cent>1000){
            
                discount = cent - cent*(10/100);
                System.out.println("Discounted Price: " + discount);
            }
            //else, no discount
            else{               
                System.out.println("Discounted Price: 0");
            }
            
        }catch(IOException | NumberFormatException e){
            
            System.out.println("Invalid Input! Try again.");
        }
    }
}
