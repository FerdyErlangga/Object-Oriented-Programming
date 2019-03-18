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
public class Studio {
    private int nomorstudio;
    private Flim flim;

    public Studio() {
    }

    public Studio(int nomorstudio, Flim flim) {
        this.nomorstudio = nomorstudio;
        this.flim = flim;
    }
    
    public void infoStudio(){
        System.out.println("Studio  : " + this.nomorstudio);
        flim.infoFlim();
        
    }

    public void setNomorstudio(int nomorstudio) {
        this.nomorstudio = nomorstudio;
    }

    public void setFlim(Flim flim) {
        this.flim = flim;
    }

    public int getNomorstudio() {
        return nomorstudio;
    }

    public Flim getFlim() {
        return flim;
    }
    
    
    
}
