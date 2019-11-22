/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity102;

import java.io.IOException;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHLabAct102Exercise09 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main ( String[] args ) throws IOException{
         
       int[] signal = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
       int[] smooth = new int [12];
       
       System.out.println("Exercise 9 --- Signal Smoother");
       
       smooth[0] = (signal[0]+signal[1])/2;
       smooth[signal.length-1] = (signal[signal.length - 1] + signal[signal.length - 2])/2;
       
       for (int i = 1;i<signal.length-1;i++){
           smooth[i] = (signal[i] + signal[i-1] + signal[i+1])/3;
       }
       System.out.print("signal: ");
       
       for ( int j=0; j < smooth.length; j++){
           System.out.print(signal[j] + " ");
       }
       
       System.out.println();
       System.out.print("smooth: ");
       for ( int j=0; j < smooth.length; j++)
       {
           System.out.print(smooth[j] + " ");
       }
       System.out.println();
    }
}