/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainaritmatika;

/**
 *
 * @author ferdy erlangga
 */
import java.util.Scanner;
public class MainAritmatika {
    public static void main(String[] args) {

    MainAritmatika fer = new MainAritmatika();
        fer.runThis();
    }

    
    void runThis(){
    
        int a, b, jumlah , kurang , kali , bagi , sisa;
        Scanner inp = new Scanner(System.in);
        
        Aritmatika arit = new Aritmatika();
        
        
        System.out.print("Bilangan 1 : ");
        a = inp.nextInt();
        arit.setA(a);
        System.out.print("Bilangan 2 : ");
        b = inp.nextInt();
        arit.setB(b);
        System.out.println("-----------------------\n");
        
        
        arit.infoAritmatika();
             
        
    }

    
}
