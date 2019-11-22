/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity103;

/**
 *
 * @author Hazel Anne
 */
import javax.swing.*;
public class MaramotHActivity103LabExercise42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double bal = 1000, pay = 0, tpay = 0;
        int month = 0;
        double fpay;
        
        try{
  
            pay = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly payments: "));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
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
        
        System.out.println("Month "+month+" \tbalance: "+bal);
        JOptionPane.showMessageDialog(null,"total payments: "+tpay 
        + "\nFinal payments that will bring the balance to zero: "+fpay);          
    }
}

