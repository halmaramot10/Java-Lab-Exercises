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
public class MaramotHLab1Activity1Exercise24 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 24 --- Check Charge");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //asks for checking and savings account
            System.out.println("Enter the amount of Checking Account in $: ");
            int checka = Integer.parseInt(dataIn.readLine());
            System.out.println("Enter the amount of Savings Account in $: ");
            int savea = Integer.parseInt(dataIn.readLine());
                
                //checks whether the savings or checking for service charge 
                if (savea>1500 || checka>1000 ){
            
                    System.out.println("Service Charge: $0");
                }
                else{
                    System.out.println("Service Charge: $0.15");
                }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
