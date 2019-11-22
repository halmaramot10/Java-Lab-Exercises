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
public class MaramotHAct104MyLoop {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        String pword, pword2;
        
        pword = JOptionPane.showInputDialog("Register your password : ");
        
        JPasswordField varA = new JPasswordField();
        
        String flag = "F";
        
        do{
            JOptionPane.showConfirmDialog(null, varA, "Enter your password : ",JOptionPane.OK_CANCEL_OPTION);
            pword2 = new String(varA.getPassword());
            
            if(pword2.equalsIgnoreCase(pword)){
                flag = "T";
                System.out.println(" Congratulations, access granted !");
            }else{
                System.out.println(" ACCESS DENIED !");
            }
        
        }while(flag.equals("F"));
    }
    
}