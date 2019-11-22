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
public class MaramotHLab1Activity1Exercise35 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            double xn = 1;
        
            System.out.println("Enter X: ");
            double x = Double.parseDouble(dataIn.readLine());
            
            System.out.println("Enter N: ");
            int n = Integer.parseInt(dataIn.readLine());
            
            if (n<=0){
                System.out.println("N must be a positive integer.");
            }
            
            else{
                for (int i = 0;i<n;i++){
                    xn = xn*x;
                }
                System.out.println(x + " raised to the power " + n + " is: "+xn);
            }
        }catch(IOException | NumberFormatException | ArithmeticException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
