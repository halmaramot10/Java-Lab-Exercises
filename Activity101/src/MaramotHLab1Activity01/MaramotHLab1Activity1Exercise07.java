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

public class MaramotHLab1Activity1Exercise07 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 7 --- Cents to Dollars");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    
        try{ //uses try - catch to prevent invalid inputs 
            
            //initializes the variable for dollars
            int dollars;
        
            //reads the users input
            System.out.println("Enter the number of cents: ");
            int cents = Integer.parseInt(dataIn.readLine());
            
            //if the value of cents is less than zero, the program prints "invalid input"
            if(cents <= 0){
                System.out.println("Invalid Input! Try Again.");
            }
            //else the program proceeds on the conversion of cents to dollars
            else{
                dollars = cents/100;
                cents = cents%100;
                System.out.println("That is " + dollars + " dollars and " +cents + " cents ");     
            }
        }catch(NumberFormatException e){
            //if the program catches an invalid input, the program stops here
            System.out.println("Invalid Input! Try Again.");
        }
    }  
    
}
