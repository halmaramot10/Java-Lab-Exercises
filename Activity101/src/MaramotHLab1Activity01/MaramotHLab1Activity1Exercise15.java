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

public class MaramotHLab1Activity1Exercise15 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 15 --- Order Checker");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        try{
            //initialize the variables
            int boltPrice = 5;
            int nutPrice = 3;
            int washersPrice = 1;
            int total;
            
            //asks for the number of bolts,nuts, and washers
            System.out.println("Number of Bolts: ");
            int bolt = Integer.parseInt(dataIn.readLine());
            System.out.println("Number of Nuts: ");
            int nut = Integer.parseInt(dataIn.readLine());
            System.out.println("Number of Washers: ");
            int washers = Integer.parseInt(dataIn.readLine());
        
            //gets the total amount
            total=(bolt*boltPrice)+(nut*nutPrice)+(washers*washersPrice);
        
            //check the order if bolt is grater than nut
            if (bolt>nut){
                System.out.println("Check the Order");
                System.out.println("Total: " + total);
            }
            //else,prints OK for the order
            else{
                System.out.println("Order is OK.");
                System.out.println("Total: " + total);
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }    
}
