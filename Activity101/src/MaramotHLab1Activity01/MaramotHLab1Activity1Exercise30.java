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
public class MaramotHLab1Activity1Exercise30 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
     public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 30");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            System.out.println("Enter the first word: ");
            String first = dataIn.readLine();
            System.out.println("Enter the second word: ");
            String second = dataIn.readLine();
        
            int flength = first.length();
            int slength = second.length();
        
            int length = 30 - (flength + slength);
        
            System.out.print(first);
                for(int i = 0; i<length;i++){
                    System.out.print(".");
                }
            System.out.println(second);
            
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }        
    }        
}
