/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainta5;

/**
 *
 * @author ferdy erlangga
 */
public class Segitiga implements DuaDimensiListener {
    private double alas;
    private double tinggi;

    public Segitiga() {
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getKeliling() {
        double k = alas * 3;
        return k;
    }
    public double getDiagonal() {
        double d = (alas * alas) + (tinggi * tinggi);
        return d;
    }
    public double getLuas() {
        double l = (alas * tinggi) / 2 ;
        return l;
    }
    public void infoKeliling() {
        System.out.println("Keliling Segitiga              : " +getKeliling() +"cm");
    }
    public void infoDiagonal(){
        System.out.println("Diagonal Sisi Miring Segitiga  : " + getDiagonal() +"cm");
    }
    public void infoLuas() { 
        System.out.println("Luas Segitiga                  : " + getLuas() +"cm");
    }
    public void display() {
        System.out.println("\nPola Segitiga");
        for (int i = 1; i < alas; i++) {
            for (int j = 1; j < tinggi; j++) {
                System.out.print(" * ");
            }
            tinggi+=1;
            System.out.println("");
            
        }
        
        System.out.println("Info Segitiga Siku - Siku");
        infoKeliling();
        infoDiagonal();
        infoLuas();
    }
    
}
