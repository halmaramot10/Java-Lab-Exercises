/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity102;

import java.io.*;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHLabAct102Exercise10 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main ( String[] args ) throws IOException{
        
        File file = new File("C:\\Users\\Hazel Anne\\Documents\\NetBeansProjects\\Activity102\\src\\activity102\\CoffeeData.txt");
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String st;
        int i = 0;
        
        double ave,s = 0, nave,sum = 0;
        double[] array = new double[15];
        
        System.out.println("Exercise 10 --- Data Tweeker (long)");
        
        while ((st = br.readLine()) != null){
            i++;
            array[i] = Double.parseDouble(st);
            sum = sum + array[i];
            if(array[i]<array[i-1]){
                s = array[i];
            }
            System.out.println("data[" + (i-1) + "] = " + array[i]);
        }
            ave = sum/i;
            nave = (sum-s)/(i-1);
            System.out.println("average: "+ ave);
            System.out.println("most distant value: "+ s); 
            System.out.println("new average: "+ nave);
  } 
} 