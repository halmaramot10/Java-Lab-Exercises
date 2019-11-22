/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaramotHLab1Activity01;

/**
 *
 * @author Hazel Anne L. Maramot
 * BSCpE 5-5
 */
public class MaramotHLab1Activity1Exercise37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)
   {    
       //triangle
       for (int i=7;i>=0;i--) //determines the number of * to be printed
       {
            
            for (int k = 0; k <i; k++){
                System.out.print(" "); //pine tree format
            }
            for (int j = 0;j!=(-2*i+(2*7+1));j++){ 
                System.out.print("*"); //prints the *
            }
            System.out.println("");
       }
       
       //square
       
       //for 4 spaces before the start of printing *
       System.out.print("    ");
       for(int i = 3; i <= 5; i++)
       {
           System.out.print("*");
       }
       //for printing the next line
       System.out.println("");
       //for 4 spaces before the start of printing *
       System.out.print("    ");
       //loop for printing the 3 *
       for(int i = 3; i <= 5; i++)
       {
           System.out.print("*");
       }
           System.out.println("");
       //for 4 spaces before the start of printing *
       System.out.print("    ");
       //loop for printing the 3 *
       for(int i = 3; i <= 5; i++)
       {
           System.out.print("*");
       }
           System.out.println("");
   }
    
}
