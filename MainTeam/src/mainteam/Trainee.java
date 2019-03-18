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
public class Trainee extends Member {
    private int lamatrainee;

    public Trainee() {
    }

    public Trainee(int lamatrainee, String nama, int umur) {
        super(nama, umur);
        this.lamatrainee = lamatrainee;
    }
    
    public void display() {
        super.display();
        System.out.println("Lama Traineer  : " + this.lamatrainee);
        
    }

    public int getLamatrainee() {
        return lamatrainee;
    }

    public void setLamatrainee(int lamatrainee) {
        this.lamatrainee = lamatrainee;
    }
    
    
    
    
}
