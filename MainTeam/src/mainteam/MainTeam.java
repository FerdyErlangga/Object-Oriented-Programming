/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainteam;

/**
 *
 * @author ferdy erlangga
 */
public class MainTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tim t = new Tim();
        t.setNama("Team T");
        
        Member m1 = new Member("Melody", 23);
        Member m2 = new Member("Haruka", 23);
        Member m3 = new Member("Kinal", 19);
        Trainee t1 = new Trainee(3,"Alicia", 17);
        Trainee t2 = new Trainee(5,"Indah", 17);
        
        t.setMember(m1);
        t.setMember(m2);
        t.setMember(m3);
        t.setMember(t1);
        t.setMember(t2);
        
        System.out.println("Full Member");
        t.DisplayfullMember();
        System.out.println("\nTraineer");
        t.DisplayTrainee();
        
    }
    
}
