/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity104;

import java.awt.Component;
import java.awt.HeadlessException;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHAct104MyAverage2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1, n2, n3, ave;
        
        try{
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ1 : "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ2 : "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ3 : "));
        
        ave = (n1+n2+n3)/3;
        
        DecimalFormat varformat = new DecimalFormat("#,###.00");
        
        String avestring;
        avestring = varformat.format(ave);
        System.out.println("("+n1+" + "+n2+" + "+n3+" )/3 = "+avestring);
        }catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Invalid Input!","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
}