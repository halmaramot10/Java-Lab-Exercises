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

public class MaramotHLab1Activity1Exercise09 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
        public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 9 --- Ohm's Law");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //asks for voltage
            System.out.println("Enter the amount of voltage: ");
            int v = Integer.parseInt(dataIn.readLine());
            //asks for resistance
            System.out.println("Enter the amount of resistance: ");
            int r = Integer.parseInt(dataIn.readLine());
            //computes and print the result
            double I = (v + 0.0)/r;
            System.out.println("The amount of current is: " + I);
        
        }catch(NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
