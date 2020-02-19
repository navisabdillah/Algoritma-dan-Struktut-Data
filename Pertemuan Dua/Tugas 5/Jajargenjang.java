/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjajargenjang;

/**
 *
 * @author Navis
 */
public class Jajargenjang {
    public int alas;
    public int tinggi;
    public int sisiMiring;

public Jajargenjang(int t, int a, int sm){
    tinggi = t;
    alas = a;
    sisiMiring = sm;
}
    
    public int hitungLuas(){
        return alas*tinggi;
    }
    public int hitungKeliling() {
        return 2*(alas + tinggi);
    }
}
