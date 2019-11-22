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
public class MaramotHActivity103LabExercise19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        try{
            //initialize the variable
            
            int age;
            //ask for year of birth and the current year
            int ybirth = Integer.parseInt(JOptionPane.showInputDialog("Year of Birth: "));
            int cyear = Integer.parseInt(JOptionPane.showInputDialog("Current Year: "));
            
            if(ybirth>=100 | cyear>=100){
                JOptionPane.showMessageDialog(null,"Input must be two digits only!");
                System.exit(0);
            }
            //subtracts the years to determine one's age
            age =(1900 + ybirth) - (2000 + cyear);
            age = Math.abs(age);
            
            //prints the result
            JOptionPane.showMessageDialog(null,"Your age: "+ age);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input! Try again.","Error!",JOptionPane.WARNING_MESSAGE);
        }  
    }
    
}
