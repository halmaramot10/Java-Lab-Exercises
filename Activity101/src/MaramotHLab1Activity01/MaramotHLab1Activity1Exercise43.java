/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaramotHLab1Activity01;

/**
 *
 * @author Hazel Anne
 */
public class MaramotHLab1Activity1Exercise43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        double effectiveness = 100.00;
        int month = 0;
        
        while(effectiveness>50.00){
           
            month++;
            
            effectiveness = effectiveness - (effectiveness * 0.04);
            
            System.out.print("\nmonth: "+ month + " effectiveness: " + effectiveness);
           
            if(effectiveness <= 50){
                
                System.out.println(" DISCARDED");
            }
        }
    }
    
}
