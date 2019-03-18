/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintoko;

/**
 *
 * @author ferdy erlangga
 */
public class MainToko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pengarang p1 = new Pengarang("Salvator Ryandaru","Yogyakarta","021-3332");
        Pengarang p2 = new Pengarang("Antonius","Bengkulu","0736-3232");
        
        Buku b1 = new Buku("220 - 23BN", "Hari Akhir", "2000", 50000, p1);
        Buku b2 = new Buku("920 - 22NN","Hari Ini","2012", 60000, p2);
        
        TokoBuku tk1 = new TokoBuku("Toko Sejahtera", "Buah Batu", b1);
        TokoBuku tk2 = new TokoBuku("Alam Sutra","Padalarang", b2);
        
        Transaksi t = new Transaksi();
        
        
        t.Tambah(new TokoBuku("Mari Bersama", "Batu Keras", new Buku("320 - 89NO","Pelangi Kecil","2019", 85000, new Pengarang("Ferdy Erlangga", "Palembang", "14022"))));
        t.Tambah(tk1);
        t.Tambah(tk2);
        t.Hapus(tk2);
        t.infoTransaksi();
        t.Cetak();
    }
    
}
