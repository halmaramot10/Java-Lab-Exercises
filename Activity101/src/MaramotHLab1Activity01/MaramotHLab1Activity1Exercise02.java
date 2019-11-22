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
public class MaramotHLab1Activity1Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
        System.out.println("Exercise 2 --- Re-assigning values to Variables");
        double value;
        double x = 0.0;
        
        //when x = 0.0
        value = 3*(Math.pow(x,2))-8*x + 4;
        System.out.println("At x = 0.0, the result 3x^2 - 8x + 4 is:  " + value);
        //when x = 2.0
        x = 2.0;
        value = 3*(Math.pow(x,2))-8*x + 4;
        System.out.println("At x = 2.0, the result 3x^2 - 8x + 4 is:  " + value);
        //when x = 4.0
        x = 4.0;
        value = 3*(Math.pow(x,2))-8*x + 4;
        System.out.println("At x = 4.0, the result 3x^2 - 8x + 4 is:  " + value);
        /*
            The program takes the assigned value in variable x and substitutes it to the
            equation 3x^2 - 8x + 4 then prints the results
        */
    }   
    
}
