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
public class MaramotHLab1Activity1Exercise04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Exercise 4 --- Trigonometry");
        //initialize the variables needed 
        double sinx = 0.5236,cosx = 0.523,sum;
       
        //get the sine and cosine
        sinx = Math.sin(sinx);
        cosx = Math.cos(cosx);
        
        //gets the sum between cos2 and sin2
        sum = Math.pow(sinx,2) + Math.pow(cosx,2);
        //prints the result
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum );
    }
    
}
