/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantor;

/**
 *
 * @author ferdy erlangga
 */
public class Karyawan {
    private String kode ,nip ,nama ,email ,phone;

    public Karyawan() {
    }

    public Karyawan(String kode, String nip, String nama, String email, String phone) {
        this.kode = kode;
        this.nip = nip;
        this.nama = nama;
        this.email = email;
        this.phone = phone;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKode() {
        return kode;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    
    protected void infoKaryawan(){
        System.out.println("           Data Karyawan           ");
        System.out.println("===================================");
        System.out.println("Kode :" + kode);
        System.out.println("Kode :" + this.nip);
        System.out.println("Kode :" + this.nama);
        System.out.println("Email        :" + this.getEmail());
        System.out.println("Mobile Phone : " +this.getPhone());
        
    }
    
    protected double hitungGaji(){
        return 1;
    }
    
    protected double hitungBonus(){
        return 1;
    }
    
    protected void infoTunjangan(){
        System.out.println("Tunjangan Karyawan  : ");
    }
    
    
    
}
