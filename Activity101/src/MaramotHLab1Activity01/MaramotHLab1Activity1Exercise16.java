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
public class MaramotHLab1Activity1Exercise16 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 16 --- Last Chance Gas");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        //initializes the variable gas
        double gas;
        int gage,tank,miles;
        
        try{
            //ask for the inputs needed
            System.out.println("Tank Capacity: ");
            tank = Integer.parseInt(dataIn.readLine());
            
            System.out.println("Gage Reading: ");
            gage = Integer.parseInt(dataIn.readLine());
            
            System.out.println("Miles per Gallon: ");
            miles = Integer.parseInt(dataIn.readLine());
        
            if (gage == 0){
            
                System.out.println("Get Gas!");
                System.exit(0);
            }
            if(gage == 0 | gage == 25 | gage == 50 | gage == 75 | gage == 100){        
            
                //converts the percent to whole number
                gage = gage/25;
                //gets the equivalent amount of gas based on the percent
                tank = tank/gage;
                //checks if the car has a capacity to go to 200 miles
                gas = tank*miles;
       
                //if the car cant reach the 200 miles, get gas
                if(gas<200){
                    System.out.println("Get Gas!");
                }
                //else the car can proceed now
                else{
                    System.out.println("Safe to Proceed");
                }
            }
            else{
                System.out.println("Invalid gage reading!");
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
    
}
