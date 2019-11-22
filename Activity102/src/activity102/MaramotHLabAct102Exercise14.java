/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity102;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHLabAct102Exercise14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        
        int sum,minimum = 0,maximum = 0;
        
        System.out.println("Exercise 14 --- Maximum and Minimum Elements");
        
        for ( int row=0; row < data.length; row++){
            
        for ( int col=0; col < data[row].length; col++){
            if(data[row][col]>maximum){
                maximum=data[row][col];
            }
            else if(data[row][col]<minimum){
                minimum = data[row][col];
            }
        }
        
    }
        sum = minimum + maximum;
        System.out.println("The sum is: " + sum);
    }
}