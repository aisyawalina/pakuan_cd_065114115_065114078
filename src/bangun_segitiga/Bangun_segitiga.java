/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bangun_segitiga;

import java.util.Scanner;

/**
 *
 * @author Win 7
 */
public class Bangun_segitiga {

/**
 *
 * @author Win 7
 */

    double a;
    double t;
    double luas;
    double s;
    double keliling;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         double a,t,luas,s,keliling; 
         
         System.out.print ("Input Alas : ");
         a = input.nextDouble();
         System.out.print ("Input Tinggi : ");
         t = input.nextDouble();
         System.out.print ("Input Sisi : ");
         s = input.nextDouble();
         luas = (a*t)/2;
         
        System.out.println ("Luas Segitiga : " + luas); 
        
        keliling = s+s+s; 
        System.out.println ("Keliling Segitiga : " + keliling); 
         
    }
    
}
