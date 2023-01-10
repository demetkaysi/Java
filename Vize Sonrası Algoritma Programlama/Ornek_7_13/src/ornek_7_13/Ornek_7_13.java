/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek_7_13;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Ornek_7_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("y(x) polinomunun derecesi: ");
        int n=input.nextInt();
        double a[]=new double[n+1];
        for (int i = 0; i <= n; i++) {
            System.out.print("x^" +i+ "nin katsayısı: ");
            a[i]=input.nextDouble();
            
        }
        System.out.print("Hesaplanacak x değeri: ");
        double b=input.nextDouble();
        double t=a[0];
        for (int i = 0; i <= n; i++) {
            t+= a[i]*Math.pow(b,i);
            
            
        }
        System.out.println("\ny("+b+")="+t);
        
    }
    
}
