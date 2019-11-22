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
public class MaramotHLab1Activity1Exercise27 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 27 --- The Pressure is Building");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int drp,dfp;
            boolean goodPressure = true;
        
            System.out.println("Input right front pressure");
            int rfp = Integer.parseInt(dataIn.readLine());
            
            if(rfp<35){
                System.out.println("Warning: pressure is out of range");
                goodPressure = false;
            }
            else if(rfp>45){
                System.out.println("Warning: pressure is out of range");
                goodPressure = false;
            }
            
            System.out.println("Input left front pressure");
            int lfp = Integer.parseInt(dataIn.readLine());
            
            if(lfp<35){
                System.out.println("Warning: pressure is out of range");
                goodPressure = false;
            }
            else if(lfp>45){
                System.out.println("Warning: pressure is out of range");
                goodPressure = false;
            }
            
            System.out.println("Input right rear pressure");
            int rrp = Integer.parseInt(dataIn.readLine());
        
            if(rrp<35){
                System.out.println("Warning: pressure is out of range");
                goodPressure = false;
            }
            else if(rrp>45){
                System.out.println("Warning: pressure is out of range");
                goodPressure = false;    
            }
            
            System.out.println("Input left rear pressure");
            int lrp = Integer.parseInt(dataIn.readLine());
            if(lrp<35){
                System.out.println("Warning: pressure is out of range");
                goodPressure = false;
            }
            else if(lrp>45){
                System.out.println("Warning: pressure is out of range");
                goodPressure = false;
            }
            
            dfp = Math.abs(lrp-rrp);
            drp = Math.abs(lfp - rfp);
            
            if(dfp == 3 && drp == 3){
                goodPressure = true;
            }
            if(lrp == rfp && lfp == rfp){
                goodPressure = true;
            }
            else if (drp !=3 && dfp !=3){
                goodPressure = false;
            }
        
            if(goodPressure == false){
                System.out.println("Inflation is BAD!");
            }
            else{
                System.out.println("Inflation is OK!");
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
    }
}
