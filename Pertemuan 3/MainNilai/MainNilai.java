/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainnilai;

import java.util.Scanner;

/**
 *
 * @author Navis
 */
public class MainNilai {

   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Mahasiswa");
        System.out.println("Masukkan jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();

        Nilai[] nm = new Nilai[jumlah];

        for (int i = 0; i < jumlah; i++) {
            sc.nextLine();
            nm[i] = new Nilai();
            System.out.println("Mahasiswa ke-" + (i + 1) + " : ");
            nm[i].namaMhs = sc.nextLine();
            System.out.println("Masukkan Nilai Tugas\t: ");
            nm[i].nilaiTugas = sc.nextInt();
            System.out.println("Masukkan nilai kuis\t: ");
            nm[i].nilaiKuis = sc.nextInt();
            System.out.println("Masukkan nilai UTS\t: ");
            nm[i].nilaiUts = sc.nextInt();
            System.out.println("Masukkan nilai UAS\t: ");
            nm[i].nilaiUas = sc.nextInt();
            System.out.println("");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total nilai mahasiswa mata kuliah Algoritma dan Struktur Data");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai total seluruh mahasiswa : " + nm[i].hitungTotalNilai(nm[i].nilaiTugas, nm[i].nilaiKuis, nm[i].nilaiUts, nm[i].nilaiUas) / 4);
        }
        Rata2 rt = new Rata2();
        System.out.println("Nilai Total Mata Kuliah Algoritama");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama Mahasiswa ke-" + (i + 1) + ": " + nm[i].namaMhs);
            System.out.println("Nilai Total : " + nm[i].hitungTotalNilai(nm[i].nilaiTugas, nm[i].nilaiKuis, nm[i].nilaiUts, nm[i].nilaiUas));
            rt.total += nm[i].hitungTotalNilai(nm[i].nilaiTugas, nm[i].nilaiKuis, nm[i].nilaiUts, nm[i].nilaiUas);
        }
        System.out.println("=====================================================");
        System.out.println("Rata-rata nilai total seluruh mahasiswa : " + rt.hitungRata(jumlah));
    }
    }
    

