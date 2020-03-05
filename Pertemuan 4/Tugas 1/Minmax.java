/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax;

import java.util.Scanner;

/**
 *
 * @author Navis
 */
public class Minmax {

    public int nilaiArray;

    public static void main(String[] args) {
        Minmax[] ppArray = new Minmax[5]; // 0(1)
        Minmax m = new Minmax(); // 0(1)

        ppArray[0] = new Minmax(); // 0 (1)

        int min = ppArray[0].nilaiArray; // 0 (1)
        int max = ppArray[0].nilaiArray; // 0 (1)

        Scanner sc = new Scanner(System.in); // 0 (1)

        for (int i = 0; i < 5; i++) { // 0(n)
            ppArray[i] = new Minmax(); // 0(1)
            System.out.println("Nilai array indeks ke- " + i); // 0(1)
            System.out.println("Masukkan nilai : ");// 0 (1)
            ppArray[i].nilaiArray = sc.nextInt(); // 0(1)
        }

        for (int i = 0; i < 5; i++) { //0(1)
            if (ppArray[i].nilaiArray < min) { //0(1)
                min = ppArray[i].nilaiArray; // 0(1)
            } else if (ppArray[i].nilaiArray > max) { // 0(1)
                max = ppArray[i].nilaiArray; // 0(1)
            }

        }
        System.out.println("Brute Force"); // 0(1)
        System.out.println("Nilai Minimal : " + min); // 0(1)
        System.out.println("Nilai Maksimal : " + max); // 0(1)
    }

}
//Notasi = 0(1+1+1+1+1+1+n*1*1*1*1+n*1*1*1*1+1+1+1+n*1+1+1+1+1+1)
//       = 0(6+n+n+n+3+5)
//       = 0(6+3n+8)
//       = 0(14+3n)
//       = 0(3n)
        //       = 0(n)
