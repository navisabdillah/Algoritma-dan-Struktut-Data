/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainalgoritma;

import java.util.Scanner;

/**
 *
 * @author Navis
 */
public class MainAlgoritma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);		
		Algoritma algo = new Algoritma();

		System.out.print("Masukkan jumlah mahasiswa : ");
		algo.control = input.nextInt();

		Algoritma[] ag = new Algoritma[algo.control];

		for (int i = 0; i < ag.length ; i++) {
			ag[i] = new Algoritma();
			algo.trash = input.nextLine();
			System.out.println("\nMahasiswa ke-" + (i+1));
			System.out.print("Masukkan Nama Mahasiswa \t: ");
			ag[i].namaMhs = input.nextLine();
			
			System.out.print("Masukkan nilai Tugas \t\t: ");
			ag[i].nilaiTugas = input.nextInt();
			System.out.print("Masukkan nilai Kuis \t\t: ");
			ag[i].nilaiKuis = input.nextInt();	
			System.out.print("Masukkan nilai UTS \t\t: ");
			ag[i].nilaiUTS = input.nextInt();
			System.out.print("Masukkan nilai UAS \t\t: ");
			ag[i].nilaiUAS = input.nextInt();

		}

		System.out.println("\n\nNama\t\t\t | Nilai Total Mata Kuliah Algoritma");
		for (int i = 0; i < ag.length ; i++) {
			System.out.println(ag[i].namaMhs + "\t\t\t | " + algo.hitungTotalNilai(ag[i].nilaiTugas,ag[i].nilaiKuis,ag[i].nilaiUTS,ag[i].nilaiUAS));
		}

		for (int i = 0; i < ag.length ; i++) {
			algo.rataRata += algo.hitungTotalNilai(ag[i].nilaiTugas,ag[i].nilaiKuis,ag[i].nilaiUTS,ag[i].nilaiUAS);
		}
		algo.rataRata = algo.rataRata/ag.length;

		System.out.println("Rata-rata\t\t | " + algo.rataRata);
		



    }
    
}
