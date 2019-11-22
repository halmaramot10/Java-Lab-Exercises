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

public class MaramotHLab1Activity1Exercise10 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 10");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //asks for the input of kilowatt-hour in cents
            System.out.println("Enter cost per kilowatt-hour in cents: ");
            double cent = Double.parseDouble(dataIn.readLine());
            //asks for the input of kilowatt-hours used per year
            System.out.println("Enter kilowatt-hours used per year: ");
            int kwhours = Integer.parseInt(dataIn.readLine());
        
            //computes the amount of annual cost
            double amount = (cent*kwhours)/100;
        
            //prints the result
            System.out.println("Annual Cost: " + amount);
        
        }catch(NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
    
}
