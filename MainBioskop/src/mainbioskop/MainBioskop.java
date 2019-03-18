/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbioskop;

/**
 *
 * @author ferdy erlangga
 */
import java.util.*;
public class MainBioskop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flim f1 = new Flim("Aquaman", "130 Menit", "Action");
        Flim f2 = new Flim("Mikcey Mouse", "120 Menit", "Horor");
        
        Studio s1 = new Studio(1, f1);
        Studio s2 = new Studio(2, f2);
        
        Penonton p1 = new Penonton("Raul Gonzalez", "Minggu", s1);
        Penonton p2 = new Penonton("Alvino Dicky", "Jumat", s2);
        
        
        
        Tiket t = new Tiket();
        
        t.tambahData(new Penonton("Ferdy Erlangga", "Selasa", new Studio(2, new Flim("Burung Kakak Tua", "120 Menit", "Comedy"))));
        t.tambahData(p1);
        t.tambahData(p2);
        t.hapusData(p2);
        
        t.getHargaKarcis();
        
        t.cetak();
    }
    
}
