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
public class TokoBuku {
    private String tokobuku, alamattoko;
    private Buku buku;

    public TokoBuku() {
    }

    public TokoBuku(String tokobuku, String alamattoko, Buku buku) {
        this.tokobuku = tokobuku;
        this.alamattoko = alamattoko;
        this.buku = buku;
    }
    
    public void infoToko() {
        System.out.println("\nNama Toko   : " + this.tokobuku);
        System.out.println("Alamat Toko : " + this.alamattoko);
        buku.infoBuku();
    }

    public void setTokobuku(String tokobuku) {
        this.tokobuku = tokobuku;
    }

    public void setAlamattoko(String alamattoko) {
        this.alamattoko = alamattoko;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTokobuku() {
        return tokobuku;
    }

    public String getAlamattoko() {
        return alamattoko;
    }

    public Buku getBuku() {
        return buku;
    }
    
    
}
