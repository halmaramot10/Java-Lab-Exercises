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
public class MaramotHLab1Activity1Exercise25 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 25 --- Tire Pressure");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try{
            
            //front pressure
            System.out.println("Input right front pressure");
            int rfp = Integer.parseInt(dataIn.readLine());
            System.out.println("Input left front pressure");
            int lfp = Integer.parseInt(dataIn.readLine());
        
            //rear pressure
            System.out.println("Input right rear pressure");
            int rrp = Integer.parseInt(dataIn.readLine());
            System.out.println("Input left rear pressure");
            int lrp = Integer.parseInt(dataIn.readLine());
        
            if(lfp != rfp || lrp != rrp ){
                System.out.println("Inflation is BAD!");
            
            }
            else{
                System.out.println("Inflation is OK!");
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
    
}
