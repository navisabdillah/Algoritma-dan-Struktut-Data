/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugastiga;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class kata {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  char[] hrf = new char[100];
  int[] jumlahHuruf = new int[100];
  int jumlahHB = 0;
  String kalmat;

  System.out.print("Masukan kalimat : ");
  kalmat = input.nextLine();

  if(kalmat.isEmpty()){
   System.out.println("Masukan kosong");
  } else {

   hrf[0] = kalmat.charAt(0);
   jumlahHuruf[0] = 1;
   jumlahHB = 1;

   for(int i = 1; i < kalmat.length(); i++){
    boolean kataMuncul = false;
    for(int a = 0; a < jumlahHB; a++){
     if(kalmat.charAt(i) == hrf[a]){
      kataMuncul = true;
      jumlahHuruf[a] += 1;
     }
    }
    if(!kataMuncul){
     hrf[jumlahHB] = kalmat.charAt(i);
     jumlahHuruf[jumlahHB] = 1;
     jumlahHB++;
    }
   }
   System.out.println("Hasil :");
   for(int i = 0; i < jumlahHB; i++){
    System.out.println("Huruf " + hrf[i] + " : " + jumlahHuruf[i] + " buah");
   }
  }
 }    
}
