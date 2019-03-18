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
public class MainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameCharacter subzero = new GameCharacter("Sub-Zero",10,20);
        
        
        GameCharacter raiden = new GameCharacter("Raiden",5,25);
        
//        subzero.getAttackhit(raiden);

        for (int i = 0; i < 3; i++) {
            subzero.hitunghit(raiden);
            raiden.infoCharacter();
        }
        
        for (int i = 0; i < 4; i++) {
            raiden.hitungkick(subzero);
            subzero.infoCharacter();
        }
        
        if( subzero.getLifepoint() == 0){
            System.out.println("Kalah ");
        }else{
            System.out.println("Menang");
        }
        
        
      
    }
    
}
