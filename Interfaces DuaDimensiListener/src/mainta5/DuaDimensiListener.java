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
public interface DuaDimensiListener {
    public static final String info = "Bidang Dua Dimensi";
    
    public double getKeliling();
    public double getDiagonal();
    public double getLuas();
    
    public void infoKeliling();
    public void infoDiagonal();
    public void infoLuas();
    public void display();
    
}
