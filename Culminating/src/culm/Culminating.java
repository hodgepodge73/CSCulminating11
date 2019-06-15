/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culm;
import java.util.Scanner;

/**
 *
 * @author bro
 */
public class Culminating {
    
    public static void main(String[] args){
        int usr;
        
        Scanner input  = new Scanner(System.in);
         
        for (int i = 0; i<8; i++){
            
            for (int p = 0; p<24; p++){
                System.out.print("___");
            }
            System.out.println();
            for (int q = 0; q<3;q++){    
                for (int j =0; j<8; j++){
                    System.out.print("|        ");
                }
                System.out.println("|");
            }
            
        }
        
        for (int i = 0; i<24*3; i++){
            System.out.print("_");
            
        }
        
        System.out.println();
    
    }
}
