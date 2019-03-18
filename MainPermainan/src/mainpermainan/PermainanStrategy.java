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
public class PermainanStrategy extends Permainan {
    private int skor;
    
    public void setNamapemain(String namapemain) {
       super.setNamapemain(namapemain);
    }
    
    public void setLevelpemain(int levelpemain) {
        super.setLevelpemain(levelpemain);
    }
    
   
    public int hitungskor(int hit, int miss) {
        
        skor = hit * 5;
        
        return skor;
    }
    
    public void Jalankan(){
    super.Jalankan();
    System.out.println("Skor Akhir : " + this.skor);
    }
    
}
