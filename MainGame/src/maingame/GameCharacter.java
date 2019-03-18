/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maingame;

/**
 *
 * @author ferdy erlangga
 */
public class GameCharacter {
    private String nama;
    private int lifepoint;
    private int attackhit;
    private int kickhit;

    public GameCharacter() {
    }

    public GameCharacter(String nama, int attackhit, int kickhit) {
        this.nama = nama;
        this.attackhit = attackhit;
        this.kickhit = kickhit;
        lifepoint = 100;
    }
    
    public void hitunghit(GameCharacter a){
        a.lifepoint = a.lifepoint - attackhit;  
    }
    
    public void hitungkick(GameCharacter b){
        b.lifepoint = b.lifepoint - kickhit;   
    }
   
    public void infoCharacter(){
        System.out.println("Nama Character   : " + this.nama);
        System.out.println("Life Point       : " + this.lifepoint);
        System.out.println("-----------------------------------");
        
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLifepoint() {
        return lifepoint;
    }

    public void setLifepoint(int lifepoint) {
        this.lifepoint = lifepoint;
    }

    public int getAttackhit() {
        return attackhit;
    }

    public void setAttackhit(int attackhit) {
        this.attackhit = attackhit;
    }

    public int getKickhit() {
        return kickhit;
    }

    public void setKickhit(int kickhit) {
        this.kickhit = kickhit;
    }
    
    
    
}
