/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmahasiswa;

import java.util.GregorianCalendar;
import java.util.*;

/**
 *
 * @author ferdy erlangga
 */
public class MahasiswaNonReguler extends Mahasiswa{
    private int totalsks;

    public MahasiswaNonReguler() {
    }

    public MahasiswaNonReguler(int totalsks, String nama, String nim, String dosenwali) {
        super(nama, nim, dosenwali);
        this.totalsks = totalsks;
    }
    
    public void infoMhs(){
        super.infoMhs();
        System.out.println("Total Sks  : " + this.totalsks);
    }
   
    public void infoTambahan(){
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Keterangan Lain ");
        System.out.println("Mahasiswa Ini Sudah Melebihi Batas Maksimal Studi yakni selama dua semester.");
        System.out.println("Atau sudah "  +  (gc.get(Calendar.YEAR) - 2018)    + " Tahun");
    }
    
}
