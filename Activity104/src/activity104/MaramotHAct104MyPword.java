/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity104;

import javax.swing.*;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHAct104MyPword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pword, pword2;
        
        pword = JOptionPane.showInputDialog("Register your password : ");
        
        JPasswordField varA = new JPasswordField();
        JOptionPane.showConfirmDialog(null, varA, "Enter your password : ", JOptionPane.OK_CANCEL_OPTION);
        
        String input; 
        
        pword2 = new String(varA.getPassword());
        
        //pword2 =JOptionPane.showInputDialog("Enter your password : ");        
        
        if(pword2.equalsIgnoreCase(pword)){
            System.out.println(" Congratulations, access granted !");
        }else{
            System.out.println(" ACCESS DENIED !");
        }
    }
    
}