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
public class MaramotHLab1Activity1Exercise23 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Exercise 23 --- Fantasy Game");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //asks for the player's name
            System.out.println("Welcome to Yertle's Quest");
            System.out.println("Enter the name of your character: ");
            String name = dataIn.readLine();
        
            //enter the statistics
            System.out.println("Enter strength: ");
            int strength = Integer.parseInt(dataIn.readLine());
            System.out.println("Enter health: ");
            int health = Integer.parseInt(dataIn.readLine());
            System.out.println("Enter luck: ");
            int luck = Integer.parseInt(dataIn.readLine());
        
            //checks if the stats exceeds 15 or not
            if ((strength + health + luck)>15){
                strength = 5;
                health = 5;
                luck = 5;
                System.out.println("You have give your character too many points! Default values have been assigned: ");
                System.out.println(name + ", strength: " + strength +", " + "health: " + health + ", " + "luck: " + " "  + luck);
            }
            else{
                System.out.println(name + ", strength: " + strength +", " + "health: " + health + ", " + "luck: " + " "  + luck);
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Invalid Input! Try again.");
        }
        
    }
    
}
