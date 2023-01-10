/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method1;

import java.util.Scanner;

/** Klavyeden Girilen N Değerine kadar sayıların karesinin toplamını alan method
 *
 * @author demet
 */
public class Method1 {

    private static boolean topla;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı giriniz: ");
        int N= input.nextInt();
        toplama(N);
        
        
      
                
    }
    
    public static int toplama(int num1){
        int toplam = 0;
        int kare = 1;
        for (int i = 1; i < num1; i++) {
         kare= i*i;
         toplam+=kare;
         
        }
        
        System.out.print(toplam);
        return 0;
    }
}
    

