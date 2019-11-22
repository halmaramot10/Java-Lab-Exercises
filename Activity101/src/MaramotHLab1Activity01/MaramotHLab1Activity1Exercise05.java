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
public class MaramotHLab1Activity1Exercise05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Exercise 5 --- Degrees to Radians");
        //assigns a 30 degrees value and converts it into radian value
        double sinx = 30*(Math.PI/180);
        double cosx = 30*(Math.PI/180);
        //initialize the sum variable
        double sum;
       
        //takes the sin and cos value
        sinx = Math.sin(sinx);
        cosx = Math.cos(cosx);
        //squares the sin and cos value then add
        sum = Math.pow(sinx,2) + Math.pow(cosx,2);
        //print results
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum );
    }
    
}
