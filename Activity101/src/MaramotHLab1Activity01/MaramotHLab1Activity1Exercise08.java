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
public class MaramotHLab1Activity1Exercise08 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 8 --- Correct Change");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            //asks for the value of change 
            System.out.println("Enter the value of change: ");
            int cents = Integer.parseInt(dataIn.readLine());
            
            //if change is less than or equal to zero, invalid input
            if(cents<=0){
                System.out.println("Invalid Input! Try again.");
            }
            
            //takes the value of dollars and puts the remainder in cents 
            int dollars = cents/100;
            cents = cents%100;
            
            //takes the value of quarters and puts the remainder in cents
            int quarters = cents/25;
            cents = cents%25;
            
            //takes the value of dime and puts the remainder in cents
            int dime = cents/10;
            cents = cents%10;
            
            //takes the value of nickels and puts the remainder in cents
            int nickel = cents/5;
            cents = cents%5;
            
            //prints the results
            System.out.println("Your change is: " + dollars + " dollar " + quarters + " quarters " + dime + " dime " + nickel +" nickel and " + cents +" cents." );
        
        }catch(NumberFormatException e){
            
            System.out.println("Invalid Input! Try again.");
        
        }
    }
    
}
