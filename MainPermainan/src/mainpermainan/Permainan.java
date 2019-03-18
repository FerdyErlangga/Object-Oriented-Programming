/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpermainan;

/**
 *
 * @author ferdy erlangga
 */
public abstract class Permainan {
    private String namapemain;
    private int levelpemain;

    public void setNamapemain(String namapemain) {
        this.namapemain = namapemain;
    }

    public void setLevelpemain(int levelpemain) {
        this.levelpemain = levelpemain;
    }

    public String getNamapemain() {
        return namapemain;
    }

    public int getLevelpemain() {
        if (levelpemain > 1 && levelpemain <= 20){
            System.out.println("Level Normal");
        }else if (levelpemain > 21 && levelpemain < 80){
            System.out.println("Level Medium");
        }else if (levelpemain > 81 && levelpemain <= 100){
            System.out.println("Level Hard");
        }
        return levelpemain;
    }
    
    public void Jalankan(){
        System.out.println("Info Pemain");
        System.out.println("Nama Pemain  : " + this.namapemain);
        System.out.println("Level Pemain : " + getLevelpemain());
    }
    
    public abstract int hitungskor(int hit , int miss);
    
    
    
}
