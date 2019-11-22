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
public class MaramotHLab1Activity1Exercise39 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            int exit = 1,sumout=0,sumin=0,num;
        
            System.out.println("In-range Adder");
        
            System.out.println("Low end of range: ");
            int low = Integer.parseInt(dataIn.readLine());
        
            System.out.println("High end of range: ");
            int high = Integer.parseInt(dataIn.readLine());
        
            while(exit == 1){
                
                System.out.println("Enter data: ");
                num = Integer.parseInt(dataIn.readLine());
                
                if(num>=low && num<=high){
                    sumin = sumin + num;
                }
                else{
                    sumout = sumout + num;
                }
                if(num == 0){
                    System.out.println("Sum of in range values: "+sumin);
                    System.out.println("Sum of out of range values: "+ sumout);
                    System.exit(0);
                }
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
    
}
