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
public class MaramotHLab1Activity1Exercise42 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
           
        
        double bal = 1000, pay = 0, tpay = 0;
        int month = 0;
        double fpay;
        
        try{
            System.out.println("Enter the monthly payments: ");
            pay = Double.parseDouble(dataIn.readLine());
        
        }catch (IOException | NumberFormatException e) {
            System.out.println("Invalid Input! Try again.");
        }
        
        System.out.println("");
        System.out.println("Begining Balance: "+bal);
        System.out.println("Monthly Interest: 1.25%");
        System.out.println("Payment amount per month: "+pay+"\n");
        
        bal = bal + (bal * (1.5 / 100)) - pay;
        
        while (bal > 0){
            month++;
            tpay += pay; 
            System.out.println("Month "+month+" \tbalance: "+bal+" \ttotal paymentss: "+tpay);
            bal = bal + (bal * (1.5 / 100)) - pay;
        }
        
        
        fpay= pay + bal;
        tpay += fpay;
        bal = 0;
        month++;
        
        System.out.println("Month "+month+" balance: "+bal+" total payments: "+tpay);
        System.out.println();
        System.out.println("Final payments that will bring the balance to zero: "+fpay);
          
    }
    
}
