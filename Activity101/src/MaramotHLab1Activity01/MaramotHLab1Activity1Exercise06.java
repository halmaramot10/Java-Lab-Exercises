/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaramotHLab1Activity01;

/**
 *
 * @author Hazel Anne L. Maramot
 * BSCpE 5-5
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaramotHLab1Activity1Exercise06 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 6 --- Area of a Circle");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //Asking for the input radius
            System.out.println("Input the radius: ");
            int r = Integer.parseInt(dataIn.readLine());
        
            //formula for area of circle
            double area = Math.pow(r,2)*Math.PI;
        
            //print the results
            System.out.println("The radius is: " + r + " The area is:  " + area );
        
        }catch(NumberFormatException e){
            
            //if there is an invalid input
            System.out.println("Invalid Input! Try again.");
        }
    }  
}