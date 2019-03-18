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
public class Bus {
    private String namabus;
    private String nopol;

    public Bus() {
    }

    public Bus(String namabus, String nopol) {
        this.namabus = namabus;
        this.nopol = nopol;
    }
    
    public void infoBus(){
        System.out.println("Nama Bus     : " + this.namabus);
        System.out.println("Nomor Polisi : " + this.nopol);
    }

    public String getNamabus() {
        return namabus;
    }

    public void setNamabus(String namabus) {
        this.namabus = namabus;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }
    
    
    
}
