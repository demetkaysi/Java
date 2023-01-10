/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonhafta6;

import java.util.Scanner;

/**
 *Dışarıdan girilen n değerine göre yıldızlı üçgen örneği
 * @author demet
 */
public class Sonhafta6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen n sayısı giriniz: ");
        int n = input.nextInt();
        //Değişekenlerimizi tanımladık.
        for (int i=1; i<n; i++) {//Döngümüzün ne kadar döneceğini belirtir.
           for(int j=i; j<n;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
               System.out.print(" ");//Boşluğumuzu belirtiyoruz.
           }
           for (int k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
               System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
               System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar. 
           }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }
    }
    
}
