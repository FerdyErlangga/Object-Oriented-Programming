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
import java.util.ArrayList;
public class Kantor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Honorer> list = new ArrayList<>();
        ArrayList <PegawaiTetap> listTetap = new ArrayList<>();
        ArrayList <Magang> listMagang = new ArrayList<>();
        
        
        Honorer ferdy = new Honorer ("FER", "101","Ferdy Erlangga", "Ferdyerlangga@gmail.com", "0895620526930", 122, "Manager", 8000000);
        list.add(ferdy);
        list.add(new Honorer("Van", "102","VanVan", "vaner@gmail.com", "0895620526293", 110, "Analyst", 3000000));
        
        
        PegawaiTetap fer = new PegawaiTetap("FER", "101","Ferdy Erlangga", "Ferdyerlangga@gmail.com", "0895620526930", 122, "Manager", 8000000);
        listTetap.add(fer);
        listTetap.add(new PegawaiTetap("Van", "102","VanVan", "vaner@gmail.com", "0895620526293", 90, "Analyst", 3000000));
        
        Magang lie = new Magang(100, "Kuliah", 500000,"Boom","1209","Bayu","Bayuskay@gmail.com","08927361839", 100, "Manager", 500000);
        listMagang.add(lie);
        
        for(int i = 0; i < list.size(); i++){
        list.get(i).infoKaryawan();
        }
        
        for(int a = 0; a < listTetap.size(); a++){
        listTetap.get(a).infoKaryawan();
        }
        
        for (int f = 0; f < listMagang.size(); f++){
        listMagang.get(f).infoKaryawan();
       
        } 
    }   
}
