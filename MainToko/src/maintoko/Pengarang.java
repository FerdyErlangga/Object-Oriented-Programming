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
public class Pengarang {
    private String namapengarang, alamat, nohp;

    public Pengarang() {
    }

    public Pengarang(String namapengarang, String alamat, String nohp) {
        this.namapengarang = namapengarang;
        this.alamat = alamat;
        this.nohp = nohp;
    }
    
    public void infoPengarang() {
        System.out.println("Nama Pengarang         : " + this.namapengarang);
        System.out.println("Alamat Pengarang       : " + this.alamat);
        System.out.println("Mobile Phone Pengarang : " + this.nohp);
    }

    public void setNamapengarang(String namapengarang) {
        this.namapengarang = namapengarang;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getNamapengarang() {
        return namapengarang;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNohp() {
        return nohp;
    }
    
    
    
    
}
