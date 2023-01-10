/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek_8_17;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Ornek_8_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j = 0;
        Scanner input=new Scanner(System.in);
        System.out.print("Matrisin tipini giriniz: ");
        int n = input.nextInt();
        int a[][]= new int[n][n];
        int b[][] = new int [n][n];
        System.out.println("Matris");
        System.out.println("-----");
        for (int i = 0; i < n; i++) {
            System.out.print("a("+(i+1)+","+(j+1)+")=");
            a[i][j]=input.nextInt();
            if (i>j){ b[i][j]=0;
            }
            else{ b[i][j]=a[i][j];
            }
            
        }
        System.out.println("Üst Üçgen Matrisi: ");
        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
            }   
            
            System.out.print(b[i][j]+"\t");
            System.out.println();
            
        }
        
    }
    
}
