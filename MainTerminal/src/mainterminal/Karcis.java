/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainterminal;

import java.util.ArrayList;

/**
 *
 * @author ferdy erlangga
 */

public class Karcis {
    private int idkarcis;
    private ArrayList <Penumpang> penumpang = new ArrayList<>();

    public Karcis() {
    }

    public Karcis(int idkarcis) {
        this.idkarcis = idkarcis;
    }
    
    public int getIdkarcis(){
        for (int idkarcis = 1; idkarcis < penumpang.size(); idkarcis++) {
            System.out.println(idkarcis);
            
        }
        return idkarcis;
        }
    
    public void setIdkarcis(){
        this.idkarcis = idkarcis;
    }
    
    public double getHargatiket(){
        double hargatiket = 0;
        System.out.println("Info Harga Tiket");
        for (int i = 0; i < penumpang.size(); i++) {
            
            if(penumpang.get(i).getHariberangkat()=="Jumat"){
            hargatiket = 150000;
            System.out.println("Untuk Hari Jumat");
            System.out.println("Harga Karcis    :"+hargatiket);
            
            }else if(penumpang.get(i).getHariberangkat()=="Sabtu" || penumpang.get(i).getHariberangkat()=="Minggu"){
            hargatiket = 200000;
            System.out.println("Untuk Hari Sabtu dan Minggu");
            System.out.println("Harga Karcis    :"+hargatiket);
            
            }else {
            hargatiket = 70000;
            System.out.println("Untuk Hari Senin - Jumat");
            System.out.println("Harga Karcis    :"+hargatiket);
            
        }
            System.out.println("----------------------------------------------");
        }
        return hargatiket;
    }
        public void cetak(){
		for (int a = 0; a < penumpang.size(); a++) {
                        
                        
			penumpang.get(a).infoPenumpang();
                        
			System.out.println();
                        
                        
		}
	}
        public void tambahData(Penumpang pnm) {
		penumpang.add(pnm);
                
	}
    
    public void hapusData(Penumpang p){
       
            penumpang.remove(p);  
    }
    
    public boolean cariPenonton(String cariNamapenumpang){
        boolean isFound=false;
        
        for(int a=0;a<penumpang.size();a++){
           if(penumpang.get(a).getNama().equals(cariNamapenumpang)){
               System.out.println(penumpang.get(a).getNama()+" Terdaftar Di List");
               isFound = true;
           }
           
        }
        return isFound;
    }
    
   

    
}
