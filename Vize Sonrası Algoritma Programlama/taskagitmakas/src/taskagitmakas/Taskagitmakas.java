/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskagitmakas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Taskagitmakas {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random rand = new Random();

    
String[] options = {"taş", "kağıt", "makas"};

   
System.out.print("Lütfen taş, kağıt veya makas seçiniz: ");
String userChoice = input.nextLine();

    
String computerChoice = options[rand.nextInt(3)];

    
System.out.println("Kullanıcı: " + userChoice + ", Bilgisayar: " + computerChoice);

    
if (userChoice.equals(computerChoice)) {
    System.out.println("Berabere!");
} 
else if 
   (userChoice.equals("taş") && computerChoice.equals("makas") ||
    userChoice.equals("kağıt") && computerChoice.equals("taş") ||
    userChoice.equals("makas") && computerChoice.equals("kağıt")) 
{
    System.out.println("Kazandınız!");
} 
else {
    System.out.println("Kaybettiniz!");
    }
  }
}

    
