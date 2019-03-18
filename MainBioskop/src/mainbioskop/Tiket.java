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
import java.util.ArrayList;
public class Tiket {
    private int idTiket;
    private ArrayList <Penonton> penonton = new ArrayList<>();

    public Tiket() {
    }

    public Tiket(int idTiket) {
        this.idTiket = idTiket;
    }
    
    public int getIdTiket(){
        for (int idTiket = 1; idTiket < penonton.size(); idTiket++) {
            System.out.println(idTiket);
        }
         return idTiket;
        }
    
    public void setIdTiket(){
        this.idTiket = idTiket;
    }
    public double getHargaKarcis(){
        double HargaTiket=0;
        System.out.println("INFO HARGA TIKET");
        for(int a = 0;a<penonton.size();a++){
        
        if(penonton.get(a).getHarinonton()=="Jumat"){
            HargaTiket = 50000;
            System.out.println("Untuk Hari Jumat");
            System.out.println("Harga Karcis    :"+HargaTiket);
            
        }else if(penonton.get(a).getHarinonton()=="Sabtu"|| penonton.get(a).getHarinonton()=="Minggu"){
            
            HargaTiket = 65000;
            System.out.println("Untuk Hari Sabtu dan Minggu");
            System.out.println("Harga Karcis    :"+HargaTiket);
            
        }else{
            HargaTiket = 40000;
            System.out.println("Untuk Hari Senin sampai Kamis");
            System.out.println("Harga Karcis    :"+HargaTiket);
        }
            System.out.println("---------------------------------");
      }
      return HargaTiket;
    }
    
    public void cetak() {
		for (int i = 0; i < penonton.size(); i++) {
                        
                        
			penonton.get(i).infoPenonton();
                        
			System.out.println();
                        
                        
		}
	}
    public void tambahData(Penonton ptn) {
		penonton.add(ptn);
                
	}
    
    public void hapusData(Penonton p){
       
            penonton.remove(p);  
    }
    
    public boolean cariPenonton(String cariNamaPenonton){
        boolean isFound=false;
        
        for(int a=0;a<penonton.size();a++){
           if(penonton.get(a).getNamapenonton().equals(cariNamaPenonton)){
               System.out.println(penonton.get(a).getNamapenonton()+" Terdaftar Di List");
               isFound = true;
           }
           
        }
        return isFound;
    }    
}
