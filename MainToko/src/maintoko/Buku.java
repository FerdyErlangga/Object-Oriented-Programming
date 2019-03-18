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
public class Buku {
    private String isbn, namabuku, tahunterbit;
    private double hargabuku;
    private Pengarang pengarang;

    public Buku() {
    }

    public Buku(String isbn, String namabuku, String tahunterbit, double hargabuku, Pengarang pengarang) {
        this.isbn = isbn;
        this.namabuku = namabuku;
        this.tahunterbit = tahunterbit;
        this.hargabuku = hargabuku;
        this.pengarang = pengarang;
    }
    
    public void infoBuku() {
        System.out.println("INFO BUKU");
        System.out.println("ISBN         : " + this.isbn);
        System.out.println("Judul Buku   : " + this.namabuku);
        System.out.println("Tahun Terbit : " + this.tahunterbit);
        System.out.println("Harga Buku   : " + this.hargabuku);
        pengarang.infoPengarang();
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNamabuku(String namabuku) {
        this.namabuku = namabuku;
    }

    public void setTahunterbit(String tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public void setHargabuku(double hargabuku) {
        this.hargabuku = hargabuku;
    }

    public void setPengarang(Pengarang pengarang) {
        this.pengarang = pengarang;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNamabuku() {
        return namabuku;
    }

    public String getTahunterbit() {
        return tahunterbit;
    }

    public double getHargabuku() {
        return hargabuku;
    }

    public Pengarang getPengarang() {
        return pengarang;
    }
    
    
    
    
}
