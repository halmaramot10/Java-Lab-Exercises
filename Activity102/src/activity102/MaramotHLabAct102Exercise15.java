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
public class MaramotHLabAct102Exercise15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] data = { {3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8} };
        
        System.out.println("Exercise 15 --- Largest Elements");
       
       for ( int row=0 ; row < data.length; row++){
           
           for (int col=0;col< data[row].length;col++){
               
               for (int acol=col+1; acol<data[row].length;acol++){
                   
                   if( data[row][col]<data[row][acol]){
                       
                       int h = data[row][col];
                       
                       data[row][col]=data[row][acol];
                       
                       data[row][acol]= h;
                    }      
                }  
            }
           
           System.out.println("Largest row "+(row+1)+ " element: "+data[row][0]);
        
        }
    }
}