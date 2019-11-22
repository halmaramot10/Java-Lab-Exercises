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
public class MaramotHLab1Activity1Exercise41 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int width,height,area,exit=1;
        
            System.out.println("Computer Aided Design Program");
        
            while(exit==1){
        
                System.out.println("First corner X coordinate: ");
                int x1 = Integer.parseInt(dataIn.readLine());
                
                System.out.println("First corner Y coordinate: ");
                int y1 = Integer.parseInt(dataIn.readLine());
        
                System.out.println("Second corner X coordinate: ");
                int x2 = Integer.parseInt(dataIn.readLine());
        
                System.out.println("Second corner Y coordinate: ");
                int y2 = Integer.parseInt(dataIn.readLine());
        
                width = Math.abs(x1-x2);
                height = Math.abs(y1-y2);
                area = width*height;
                
                System.out.println("Width: " + width + " Height: " + height + " Area: " + area);
                
                if(width == 0 || height == 0){
                    System.exit(0);
                }
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
    
}
