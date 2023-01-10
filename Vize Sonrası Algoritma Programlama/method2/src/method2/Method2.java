/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method2;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Method2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
         
        if(asalMi(sayi)) { 
            System.out.println("Girilen sayı asal bir sayıdır.");
        }
        else {
            System.out.println("Girilen sayı asal bir sayı degildir.");
        }   
    }
    
    
	static boolean asalMi(int sayi) {
		int sayac = 0;
		for(int i = 2; i < sayi; i++)
		{
			if(sayi % i == 0) {
				sayac++;
			}
		}
        return sayac == 0;
	}
    
}
