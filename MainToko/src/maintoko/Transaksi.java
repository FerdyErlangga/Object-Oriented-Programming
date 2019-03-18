/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintoko;

import java.util.ArrayList;

/**
 *
 * @author ferdy erlangga
 */
public class Transaksi {
    private int idtransaksi;
    private ArrayList <TokoBuku> Toko = new ArrayList<>();

    public Transaksi() {
    }

    public Transaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public int getIdtransaksi() {
        for (int idtransaksi = 1; idtransaksi < Toko.size(); idtransaksi++) {
            TokoBuku get = Toko.get(idtransaksi);
            
        }
        return idtransaksi;
    }
    
    public void Tambah(TokoBuku tk) {
        Toko.add(tk);
    }
    
    public void Hapus(TokoBuku t) {
        Toko.remove(t);
    }
    
    public void Cetak() {
        
        for (int i = 0; i < Toko.size(); i++) {
            Toko.get(i).infoToko();
            
        }
        
    }
    
    
    
    
    
}
