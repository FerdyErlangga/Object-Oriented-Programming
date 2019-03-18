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
public class Aritmatika {
    private int a;
    private int b;
    private int jumlah;
    private int kurang;
    private int kali;
    private int bagi;
    private int sisa;

    public Aritmatika() {
    }

    public Aritmatika(int a, int b, int jumlah, int kurang,int kali, int bagi, int sisa) {
        this.a = a;
        this.b = b;
        this.jumlah = jumlah;
        this.kurang = kurang;
        this.kali = kali;
        this.bagi = bagi;
        this.sisa = sisa;
    }
    
    public int hitungJumlah(){
        jumlah = a + b;
        return jumlah;
    }
    
    public int hitungKurang(){
        kurang = (a-b);
        return kurang;
    }
    
    public int hitungKali(){
        kali = (a*b);
        return kali;
    }
    
    public int hitungBagi(){
        bagi = (a / b);
        return bagi;
        
    }
    
    public int hitungSisa(){
        sisa = (a%b);
        return sisa;
        
    }
    
    public void infoAritmatika(){
        System.out.println("Bilangan 1 : " + a);
        System.out.println("bilangan 2 : " + b);
        System.out.println("Jumlah     : " + hitungJumlah());
        System.out.println("Kurang     : " + hitungKurang());
        System.out.println("Kali       : " + hitungKali());
        System.out.println("Bagi       : " + hitungBagi());
        System.out.println("Sisa       : " + hitungSisa());
        
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getKurang() {
        return kurang;
    }

    public void setKurang(int kurang) {
        this.kurang = kurang;
    }
    
    public int getKali() {
        return kali;
    }

    public void setKali(int kali) {
        this.kali = kali;
    }

    public int getBagi() {
        return bagi;
    }

    public void setBagi(int bagi) {
        this.bagi = bagi;
    }

    public int getSisa() {
        return sisa;
    }

    public void setSisa(int sisa) {
        this.sisa = sisa;
    }
    
    
    
}
