/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlingkaran;

/**
 *
 * @author Navis
 */
public class ProgramLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        
        l1.r = 7;
        
        System.out.println("Luas Lingkaran = " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran = " + l1.hitungKeliling());
    }
    
}
