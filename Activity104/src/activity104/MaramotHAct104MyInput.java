/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity104;

import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHAct104MyInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        
        try{
        name = JOptionPane.showInputDialog("Enter name ");
        System.out.println("Hello "+name);
        
        String input;
        input = JOptionPane.showInputDialog("How old are you : ");
        
        int age, year;
        age = Integer.parseInt(input);
        
        year = 2019-age;                                
        System.out.println("You were born in "+year);
        }catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Invalid Input!","Error!",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}