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
public class Penumpang {
    private String nama;
    private String hariberangkat;
    private Pul pul;

    public Penumpang() {
    }

    public Penumpang(String nama, String hariberangkat, Pul pul) {
        this.nama = nama;
        this.hariberangkat = hariberangkat;
        this.pul = pul;
    }
    
    public void infoPenumpang(){
        System.out.println("Informasi Penumpang");
        System.out.println("Nama Penumpang  : " + this.nama);
        System.out.println("Hari Berangkat  : " + this.hariberangkat);
        pul.infoTujuan();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHariberangkat() {
        return hariberangkat;
    }

    public void setHariberangkat(String hariberangkat) {
        this.hariberangkat = hariberangkat;
    }

    public Pul getPul() {
        return pul;
    }

    public void setPul(Pul pul) {
        this.pul = pul;
    }
    
    

    
     
    
}
