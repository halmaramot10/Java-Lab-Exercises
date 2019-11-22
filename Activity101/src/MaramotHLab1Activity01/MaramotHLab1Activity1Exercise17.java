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
public class MaramotHLab1Activity1Exercise17 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 17 --- Pie Eating Contest");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //ask for the weight
            System.out.println("Enter your pounds: ");
            int cpounds = Integer.parseInt(dataIn.readLine());
            
            //checks whether the weight is qualified for heavyweight
            if(cpounds>=220 && cpounds<=280){
                System.out.println("Your'e allowed in the contest!");
            }
            else{
                System.out.println("You're not allowed in the contest!");
            }
        }catch(IOException | NumberFormatException e){            
            System.out.println("Invalid Input! Please try again.");
        }
    }
    
}
