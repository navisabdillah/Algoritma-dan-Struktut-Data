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
public class nodeProyek<T> {
     String data1;
     String data2;
     String data3;
     String data4;
     nodeProyek next;
    
    public nodeProyek (String nip,String nama,String jabatan,String salary,nodeProyek next) {
        data1 = nip;
        data2 = nama;
        data3 = jabatan;
        data4 = salary;
        this.next=next;        
    }    
   
}