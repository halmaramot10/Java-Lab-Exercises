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
public class MaramotHLab1Activity1Exercise44 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       
       BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        try{
            
            int x;  
            float n= 1f;  
            double sum=1.0,term=1.0;
            
            System.out.println("Enter value for x :  ");  
            
            x=Integer.parseInt(dataIn.readLine()); 
             
                while(term >=  1.0E-12)  
                {  
                    term = term * ((float)x / n); 
                    sum = sum + term; 
                    System.out.println(" n : "+n+"    term :  "+term+"    sum :  "+sum);  
                    n++;  
                } 
            System.out.println("ex^ using sum + term =  " + sum);  
            System.out.println("e^x using Math.exp(x)=  "+ Math.exp(x));
        
        }catch (IOException | ArithmeticException e){
                System.out.println ("Invalid!"); 
        }            
    }   
}
