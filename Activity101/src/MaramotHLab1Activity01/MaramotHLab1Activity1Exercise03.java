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
public class MaramotHLab1Activity1Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Exercise 3 --- Average Rain Fall");
        //initialize the variables
        double april = 12,may = 14,june = 8,avg;
        
        //get the average
        avg = (april+may+june)/3;
        
        //prints the results
        System.out.println("Rainfall for April: \t"+april); 
        System.out.println("Rainfall for May: \t"+may);
        System.out.println("Rainfall for June: \t"+june);
        System.out.println("Average Rainfall: \t"+avg);
    }   
}
