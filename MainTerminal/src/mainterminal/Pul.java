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
public class Pul {
    private String Tujuan;
    private String Lokasiawal;
    private Bus bus;

    public Pul() {
    }

    public Pul(String Tujuan, String Lokasiawal, Bus bus) {
        this.Tujuan = Tujuan;
        this.Lokasiawal = Lokasiawal;
        this.bus = bus;
    }
    
    public void infoTujuan(){
        System.out.println("Lokasi Awal  : " + this.Lokasiawal);
        System.out.println("Tujuan       : " + this.Tujuan);
        bus.infoBus();
    }

    public String getTujuan() {
        return Tujuan;
    }

    public void setTujuan(String Tujuan) {
        this.Tujuan = Tujuan;
    }

    public String getLokasiawal() {
        return Lokasiawal;
    }

    public void setLokasiawal(String Lokasiawal) {
        this.Lokasiawal = Lokasiawal;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
    
    

    
    
    
}
