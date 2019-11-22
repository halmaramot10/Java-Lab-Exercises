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
public class MaramotHLab1Activity1Exercise36 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.println("Initial number of stars: ");
        
        int nstar = Integer.parseInt(dataIn.readLine());
         
        for (int i = nstar; i >= 1; i--) { 
       		System.out.print("\n"); 
	   		for (int a = 1;  a <= i; a++) { 
	   			System.out.print("*");
	   		}
	   }
        System.out.println("");
    
        }catch(NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
