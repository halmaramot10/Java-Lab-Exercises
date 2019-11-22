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
public class MaramotHLabAct102Exercise16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        
        System.out.println("Exercise 16 --- Reversal of Elements in Each Row");
        
        for ( int row=0; row < data.length; row++){
             
            for ( int col=0; col < ((data[row].length)/2); col++){
                
                int temp = data[row][col];
                data[row][col]=data[row][data[row].length-1-col];
                data[row][data[row].length-1-col]=temp;
                
            }
        }
        for ( int rows=0; rows < data.length; rows++){

            for ( int cols=0; cols < data[rows].length; cols++) {
                System.out.print(data[rows][cols]+", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


