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
 * @author Hazel Anne
 */
public class MaramotHLab1Activity1Exercise18 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 18 --- Ground Beef Value Calculator");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            //initializes the variables
            double packa;
            double packb;
        
            //asks for prices and percent
            System.out.println("Price per pound package A:  ");
            double pricea = Double.parseDouble(dataIn.readLine());
            System.out.println("Percent lean package A:  ");
            double percenta = Double.parseDouble(dataIn.readLine());
            System.out.println("Price per pound package B:  ");
            double priceb = Double.parseDouble(dataIn.readLine());
            System.out.println("Percent lean package B:  ");
            double percentb = Double.parseDouble(dataIn.readLine());
        
            //takes the prices for pack a and b
            packa = pricea/(percenta*0.01);
            packb = priceb/(percentb*0.01);
        
            //prints the prices
            System.out.println("Package A cost per pound of lean: " + packa);
            System.out.println("Package B cost per pound of lean: " + packb);
        
            //comparison between pack a and b
            if (packa<packb && packa != packb){
                System.out.println("Package A is the best value");       
            }
            else if (packa>packb && packa != packb){
                System.out.println("Package B is the best value");
            }
        
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input. Try again.");
        }
    }
    
}
