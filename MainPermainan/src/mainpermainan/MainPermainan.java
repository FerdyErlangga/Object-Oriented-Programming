/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpermainan;

/**
 *
 * @author ferdy erlangga
 */
public class MainPermainan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PermainanArcade pea = new PermainanArcade();
        System.out.println("Permainan Arcade");
        pea.setNamapemain("Salvator Ryandaru");
        pea.setLevelpemain(19);
        pea.hitungskor(30, 10);
        pea.Jalankan();
        
        PermainanStrategy pes = new PermainanStrategy();
        System.out.println("\nPermainan Strategy");
        pes.setNamapemain("Antonius Ronaldo");
        pes.setLevelpemain(89);
        pes.hitungskor(30,0);
        pes.Jalankan();
    }
    
}
