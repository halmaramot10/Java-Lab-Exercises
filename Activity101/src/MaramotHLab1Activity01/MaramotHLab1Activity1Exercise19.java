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

public class MaramotHLab1Activity1Exercise19 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 19 --- Y2K Problem Detector");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //initialize the variable
            
            int age;
            //ask for year of birth and the current year
            System.out.println("Year of Birth: ");
            int ybirth = Integer.parseInt(dataIn.readLine());
            System.out.println("Current Year: ");
            int cyear = Integer.parseInt(dataIn.readLine());
            if(ybirth>=100 | cyear>=100){
                System.out.println("Input must be two digits only!");
                System.exit(0);
            }
            //subtracts the years to determine one's age
            age =(1900 + ybirth) - (2000 + cyear);
            age = Math.abs(age);
            
            //prints the result
            System.out.println("Your age: "+ age);
        
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input!Try again.");
        }
    }
    
}
