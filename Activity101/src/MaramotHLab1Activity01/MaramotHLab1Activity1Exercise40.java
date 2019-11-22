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
public class MaramotHLab1Activity1Exercise40 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        try{
            double total,weight;
            
            System.out.println("Weight of Order: ");
            weight = Integer.parseInt(dataIn.readLine());
        
            while(weight>0){
                if(weight<=10){
                    total = 3.0;
                }
            else{
                total = 3.0 +((weight-10)*0.25);
            }
            System.out.format("Shipping Cost:$%.2f",total);
       
            System.out.println("\nWeight of Order: ");
            weight = Integer.parseInt(dataIn.readLine());
        }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
