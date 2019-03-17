/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainta5;

/**
 *
 * @author ferdy erlangga
 */
public class MainTA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang pj = new PersegiPanjang();
        pj.setLebar(5);
        pj.setPanjang(8);
        pj.display();
        
        Segitiga s = new Segitiga();
        s.setTinggi(1);
        s.setAlas(10);
        s.display();
    }
    
}
