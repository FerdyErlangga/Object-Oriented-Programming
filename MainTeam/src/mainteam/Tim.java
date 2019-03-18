/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainteam;

import java.util.ArrayList;

/**
 *
 * @author ferdy erlangga
 */
public class Tim {
    private String nama;
    private ArrayList <Member> member = new ArrayList<>();

    public Tim() {
    }

    public Tim(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setMember(Member m) {
		member.add(m);
                
    }
    public void DisplayfullMember() {
	
        for (int i = 0; i < 3; i++) {
               member.get(i).display();
            }
    }
    
    public void DisplayTrainee() {
	for (int a = 3; a < member.size(); a++) {
               member.get(a).display();
             }
	}
    
    
}
