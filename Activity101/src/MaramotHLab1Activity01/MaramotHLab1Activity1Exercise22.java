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
public class MaramotHLab1Activity1Exercise22 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 22 --- Microwave Oven");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            //asks for no of items & heating time
            System.out.println("Number of Items: ");
            int items = Integer.parseInt(dataIn.readLine());
            
            if(items<=0){
                System.out.println("Enter a valid item!");
            }
            System.out.println("Heating Time: ");
            int heat = Integer.parseInt(dataIn.readLine());
            //checks the number of items and determines the equivalent heating time 
            if(items==1){
                System.out.println("Recommended Heating Time: " + heat);
            }
            if(items==2){
                heat = heat + (heat/2);
                System.out.println("Recommended Heating Time: " + heat);
            }
            if(items==3){
                heat = heat*2;
                System.out.println("Recommended Heating Time: " + heat);
            }
            if(items>3){
                System.out.println("More than 3 items is not recommended!");
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
