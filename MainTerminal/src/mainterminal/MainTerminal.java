/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainterminal;

/**
 *
 * @author ferdy erlangga
 */
public class MainTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bus b1 = new Bus("Primajasa", "D 1290 AAW");
        Bus b2 = new Bus("San" , "D 2200 EWD");
        
        Pul p1 = new Pul("Bandung","Jakarta", b1);
        Pul p2 = new Pul("Bogor", "Cicalengka", b2);
        
        Penumpang pn1 = new Penumpang("Ferdy Erlangga","Kamis", p1);
        Penumpang pn2 = new Penumpang("Dedi" , "Jumat" , p2);
        
        Karcis k = new Karcis();
        
        k.tambahData(new Penumpang("Andre Pratama", "Minggu" ,new Pul("Semarang", "Bandung", new Bus("IndahPrasta", "D 3334 AAD"))));
        k.tambahData(pn1);
        k.tambahData(pn2);
        k.hapusData(pn2);
        k.getHargatiket();
        
        k.cetak();
    }
    
}
