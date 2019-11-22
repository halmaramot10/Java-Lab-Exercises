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
public class MaramotHLab1Activity1Exercise20 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 20 --- Internet Delicatessen");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //initializes the variable 
            double ship;
            double total;
            double rem;
            
            //ask for inputs needed
            System.out.println("Enter the item: ");
            String itemname = dataIn.readLine();
            System.out.println("Enter the price: ");
            int price = Integer.parseInt(dataIn.readLine());
            System.out.println("Overnight delivery (0==no, 1==yes)");
            int deli = Integer.parseInt(dataIn.readLine());
            
            //gets the price
            rem = price/100.00;
        
            //for less than 10 dollars
            if(rem<10){
                ship = 2.0;
                switch(deli){
                    case 0: //for daytime delivery
                        total = rem + ship;
                        System.out.println(itemname +" " + rem);
                        System.out.println("shipping " + ship);
                        System.out.println("total: " + total);
                    break;
                    case 1: //for overnight delivery
                        ship = ship + 5.00;
                        total = rem + ship;
                        System.out.println(itemname + " \t" + rem);
                        System.out.println("shipping: " + ship);
                        System.out.println("total: \t" + total);
                    break;
                    default:
                        System.out.println("Invalid Input!");
                    break;
                }    
            }
            //for more than 10 dollars
            else if(price>10){
                ship = 3.0;
                switch(deli){
                    case 0: //for daytime
                        total = rem + ship;
                        System.out.println(itemname +" " + rem);
                        System.out.println("shipping " + ship);
                        System.out.println("total: " + total);
                    break;
                    case 1: //for overnight
                        ship = ship + 5.00;
                        total = rem + ship;
                        System.out.println(itemname +" " + rem);
                        System.out.println("shipping " + ship);
                        System.out.println("total: " + total);
                    break;
                    default:
                        System.out.println("Invalid Input!");
                    break;
                }
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again. ");
        }
    }    
}
