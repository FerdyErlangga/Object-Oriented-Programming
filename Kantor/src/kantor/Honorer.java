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
public class Honorer extends Karyawan {
    private int jamkerja;
    private String jabatan;
    private double gajipokok;

    public Honorer() {
    }

    public Honorer(String kode, String nip, String nama, String email, String phone,int jamkerja, String jabatan, double gajipokok) {
        super(kode, nip, nama, email, phone);
        this.jamkerja = jamkerja;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
    }
    
    public double hitungBonus() {
        double bonus = 0;
        if(this.jamkerja > 100){
            bonus = bonus + (this.jamkerja - 100) * 10000;
        }
        return bonus;
    }
    
    public double hitungGaji(){
        double gaji = this.gajipokok + hitungBonus();
        if(this.jabatan.equals("Manager")){
            gaji = gaji + 12500;
        } else if(this.jabatan.equals("Analyst")){
            gaji = gaji + 11500;
        } else if(this.jabatan.equals("Designer")){
            gaji = gaji + 10500;
        }
        return gaji;
    }
    
    public double hitungPajak(){
        double pajak = 0;
        if(hitungGaji() > 5000000) {
            pajak = (hitungGaji() *0.10);
        }
        return pajak;
    }
    
    public double hitungGajibersih(){
        double gajibersih = hitungGaji()- hitungPajak();
        return gajibersih;
    }
    
    
    public void infoTunjangan(){
        System.out.println("Informasi Tunjangan Karyawan Honorer");
        System.out.println(" 1. Tunjangan Makan Rp.20.000 per Hari");
        System.out.println(" 2. Tunjangan Transportasi Rp.40.000 per Hari");
        System.out.println(" 3. Tunjangan Pulsa Rp.50.000 per Bulan");
    }
    
    public void infoKaryawan(){
        super.infoKaryawan();
        System.out.println("Jam Kerja Sebulan : " + this.jamkerja);
        System.out.println("Jabatan           : " + this.jabatan);
        System.out.println("Gaji Pokok        : Rp." + this.gajipokok);
        System.out.println("Gaji Per Bulan    : Rp." + hitungGaji());
        System.out.println("Pajak Per Bulan   : Rp." + hitungPajak());
        System.out.println("Gaji Bersih       : Rp." + hitungGajibersih());
        infoTunjangan();
        System.out.println("----------------------------------------- \n");
    }

    public void setJamkerja(int jamkerja) {
        this.jamkerja = jamkerja;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getJamkerja() {
        return jamkerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGajipokok() {
        return gajipokok;
    }
    
    
    
    
    
}
