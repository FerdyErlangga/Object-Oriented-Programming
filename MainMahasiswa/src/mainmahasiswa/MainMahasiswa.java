/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmahasiswa;

/**
 *
 * @author ferdy erlangga
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa m1 = new Mahasiswa("Ferdy Erlangga","6701184119", "PRA");
        MahasiswaReguler mr1 = new MahasiswaReguler(20,"Alvino Dicky","6701181923","TGN");
        MahasiswaNonReguler mnr1= new MahasiswaNonReguler(25,"Fikri Haikal","6701184041","SKS");
        
        m1.infoMhs();
        mr1.infoMhs();
        mnr1.infoMhs();
        mnr1.infoTambahan();
    }
    
}
