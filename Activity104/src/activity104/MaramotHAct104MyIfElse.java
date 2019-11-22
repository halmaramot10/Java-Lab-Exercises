/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity104;

import java.awt.Component;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHAct104MyIfElse {
    

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int q1, q2, q3, ave;
        
        try{
        q1 = Integer.parseInt(JOptionPane.showInputDialog("Enter LQ1 : "));
        q2 = Integer.parseInt(JOptionPane.showInputDialog("Enter LQ2 : "));
        q3 = Integer.parseInt(JOptionPane.showInputDialog("Enter LQ3 : "));
        ave = (q1+q2+q3)/3;
        
        String remarks;
        
        if(ave>=80 && ave<=100){
            remarks ="Excellent";
        }else if(ave>=60 && ave<80){
            remarks = "Fail";
        }else if(ave>=0 && ave<60){
            remarks = "Fail";
        }else{
            remarks = "Illegal Grade";
        }
        
        System.out.println("("+q1+" + "+q2+" + "+q3+" )/3 = "+ave);
        System.out.println(remarks);
        }catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Invalid Input!","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
}