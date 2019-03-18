/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainteam;

/**
 *
 * @author ferdy erlangga
 */
public class Member {
    protected String nama;
    protected int umur;

    public Member() {
    }

    public Member(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public void display(){
        System.out.println("Nama     : " + this.nama);
        System.out.println("Umur     : " + this.umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
    
}
