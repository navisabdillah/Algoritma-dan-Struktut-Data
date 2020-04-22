/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class nodeMahasiswa<T> {
     String data1;
    String data2;
    String data3;
    nodeMahasiswa next;

    
    public nodeMahasiswa (String nim,String nama,String alamat,nodeMahasiswa next) {
        data1 = nim;
        data2 = nama;
        data3 = alamat;
        this.next=next;        
    }
}    

