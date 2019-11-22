/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activity102;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHLabAct102Exercise18 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main ( String[] args ) throws FileNotFoundException, UnsupportedEncodingException{
         
        try (PrintWriter writer = new PrintWriter("Exercise18.txt", "UTF-8")) {
       
            for( int c=0;c<64;c+=8){
                for(int b=0;b<8;b++){
                    for(int a=0;a<64;a++){
             
                        writer.print(c);             
                    }
                    writer.println();
                }
            }    
        }
    }
}
