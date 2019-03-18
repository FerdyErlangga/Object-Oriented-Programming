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
public class MahasiswaReguler extends Mahasiswa{
    private int totalsks;

    public MahasiswaReguler() {
    }

    public MahasiswaReguler(int totalsks, String nama, String nim, String dosenwali) {
        super(nama, nim, dosenwali);
        this.totalsks = totalsks;
    }
    
    public void infoMhs(){
        super.infoMhs();
        System.out.println("Total SKS  : " +this.totalsks);
    }

    public int getTotalsks() {
        return totalsks;
    }

    public void setTotalsks(int totalsks) {
        this.totalsks = totalsks;
    }
    
    
    
    
    
}
