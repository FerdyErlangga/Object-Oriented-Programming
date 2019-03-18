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
public class Penonton {
    private String namapenonton, harinonton;
    private Studio studio;

    public Penonton() {
    }

    public Penonton(String namapenonton, String harinonton, Studio studio) {
        this.namapenonton = namapenonton;
        this.harinonton = harinonton;
        this.studio = studio;
    }
    public void infoPenonton(){
        System.out.println("Nama Penonton : " + this.namapenonton);
        System.out.println("Hari Penonton : " + this.harinonton);
        studio.infoStudio();
    }

    public void setNamapenonton(String namapenonton) {
        this.namapenonton = namapenonton;
    }

    public void setHarinonton(String harinonton) {
        this.harinonton = harinonton;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public String getNamapenonton() {
        return namapenonton;
    }

    public String getHarinonton() {
        return harinonton;
    }

    public Studio getStudio() {
        return studio;
    }
    
    
    
}
