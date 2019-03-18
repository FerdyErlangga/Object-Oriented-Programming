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
public class Mahasiswa {
    private String nama, nim, dosenwali;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String dosenwali) {
        this.nama = nama;
        this.nim = nim;
        this.dosenwali = dosenwali;
    }
    
    public void infoMhs(){
        System.out.println("Info Mahasiswa");
        System.out.println("Nama Mahasiswa  : " + this.nama);
        System.out.println("NIM             : " + this.nim);
        System.out.println("Dosen Wali      : " + this.dosenwali);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getDosenwali() {
        return dosenwali;
    }

    public void setDosenwali(String dosenwali) {
        this.dosenwali = dosenwali;
    }
    
    
}
