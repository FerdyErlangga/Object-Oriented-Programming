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
public class PersegiPanjang implements DuaDimensiListener {
    private double panjang;
    private double lebar;

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getKeliling() {
        double kel = 2 * (panjang + lebar);
        return kel;
    }
    public double getDiagonal() {
        double diag = ((double)panjang*panjang+(double)lebar*lebar);
        return diag;
    }
    public double getLuas() {
        double luas = panjang * lebar;
        return luas;
    }
    
    public void infoKeliling() {
        System.out.println("Keliling Persegi Panjang  : " + getKeliling() +"cm");
    }
    public void infoDiagonal() {
        System.out.println("Diagonal Persegi Panjang  : " + getDiagonal() +"cm");
    }
    public void infoLuas() {
        System.out.println("Luas Persegi Panjang      : " + getLuas() +"cm");
    }
    public void display() {
        System.out.println("Pola Persegi Panjang");
        for (int x = 1; x <=lebar; x++) {
            for (int y = 1; y <=panjang; y++) {
                System.out.print(" * ");
                
            }
            System.out.println("");
            
        }
        
        System.out.println("Info Persegi Panjang");
        infoKeliling();
        infoDiagonal();
        infoLuas();
    }
    
}
