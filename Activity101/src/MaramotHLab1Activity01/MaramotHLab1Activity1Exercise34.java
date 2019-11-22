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
public class MaramotHLab1Activity1Exercise34 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int n2,n3;
            int square=0;
            int cube=0;
        
            System.out.println("Upper Limit: ");
            int limit = Integer.parseInt(dataIn.readLine());
        
            int[] sinput = new int[limit+1];
            int[] cinput = new int[limit+1];
            
            for (int i = 1; i<=limit; i++){
            
                sinput[i] = i;
                cinput[i] = i;
                square = square + (sinput[i]*sinput[i]);
                cube = cube + (cinput[i]*cinput[i]*cinput[i]);
            }
            n2 = (limit*(limit+1)*((2*limit)+1))/6;
            n3 = (limit*limit)*((limit+1)*(limit+1))/4;
            
            System.out.println("The sum of Squares is " +square);
            System.out.println("The sum of Cubes is " +cube);
            System.out.println("The sum of Squares using n(n+1)(2n+1)/6 is:  " +n2);
            System.out.println("The sum of Cubes using n^2(n+1)^2/4: " +n3);
            
        }catch(IOException | NumberFormatException | ArithmeticException e ){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
