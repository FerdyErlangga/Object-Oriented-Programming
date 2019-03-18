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
public class Flim {
    private String judulflim , durasi , genre;

    public Flim() {
    }

    public Flim(String judulflim, String durasi, String genre) {
        this.judulflim = judulflim;
        this.durasi = durasi;
        this.genre = genre;
    }
    
    public void infoFlim(){
        System.out.println("Informasi Flim");
        System.out.println("Judul Flim  : " + this.judulflim);
        System.out.println("Durasi Flim : " + this.durasi);
        System.out.println("Genre Flim  : " + this.genre);
    }

    public void setJudulflim(String judulflim) {
        this.judulflim = judulflim;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getJudulflim() {
        return judulflim;
    }

    public String getDurasi() {
        return durasi;
    }

    public String getGenre() {
        return genre;
    }
    
   
    
}
