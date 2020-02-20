/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysegitiga;

/**
 *
 * @author Navis
 */
public class Segitiga {
      public int alas, tinggi;
    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    public double hitungLuas(){
        return 0.5 * alas * tinggi /2;
    }
    public double hitungkeliling(){
        double hasil = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return hasil + alas + tinggi;
    }
}
