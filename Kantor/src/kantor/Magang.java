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
public class Magang extends Honorer {
    private int jamMagang;
    private String Status;
    private double pendapatanMagang;

    public Magang() {
    }

    public Magang(int jamMagang, String Status, double pendapatanMagang, String kode, String nip, String nama, String email, String phone, int jamkerja, String jabatan, double gajipokok) {
        super(kode, nip, nama, email, phone, jamkerja, jabatan, gajipokok);
        this.jamMagang = jamMagang;
        this.Status = Status;
        this.pendapatanMagang = pendapatanMagang;
    }
    
    public double hitungPendapatanBonus() {
        double pendapatanbonus = 0;
        if(this.jamMagang > 80){
            pendapatanbonus = pendapatanbonus + (this.jamMagang - 100) * 5000;
        }
        return pendapatanbonus;
    }
     public double hitungMagang(){
        double Magang = this.pendapatanMagang + hitungPendapatanBonus();
        if(this.Status.equals("Kuliah")){
            Magang = Magang + 12500;
        } else if(this.Status.equals("SMK")){
            Magang = Magang + 11500;
        } else if(this.Status.equals("Pengangguran")){
            Magang = Magang + 10500;
        }
        return Magang;
    }
     public double hitungPendapatanBersih(){
         double pendapatanbersih = this.pendapatanMagang + (hitungPendapatanBonus() + hitungMagang());
         return pendapatanbersih;
     }
     public void infoTunjangan(){
        System.out.println("Informasi Tunjangan Karyawan Honorer");
        System.out.println(" 1. Tunjangan Makan Rp.20.000 per Hari");
        System.out.println(" 2. Tunjangan Rokok Rp.10.000 per Hari");
        System.out.println(" 3. Tunjangan Transportasi Rp.30.000 per Per Hari");
    }
    
    public void infoKaryawan(){
        super.infoKaryawan();
        System.out.println("Jam Magang Sebulan : " + this.jamMagang);
        System.out.println("Status             : " + this.Status);
        System.out.println("Pendapatan Magang  : Rp." + this.pendapatanMagang);
        System.out.println("Bonus Per Bulan    : Rp." + hitungPendapatanBonus());
        System.out.println("Tambahan Per Bulan : Rp." + hitungMagang());
        System.out.println("Pendapatan Bersih  : Rp." + hitungPendapatanBersih());
        infoTunjangan();
        System.out.println("----------------------------------------- \n");
    }

    public void setJamMagang(int jamMagang) {
        this.jamMagang = jamMagang;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setPendapatanMagang(double pendapatanMagang) {
        this.pendapatanMagang = pendapatanMagang;
    }

    public int getJamMagang() {
        return jamMagang;
    }

    public String getStatus() {
        return Status;
    }

    public double getPendapatanMagang() {
        return pendapatanMagang;
    }
    
    
    
}
