/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjajargenjang;

import java.util.Scanner;

/**
 *
 * @author Navis
 */
public class Arrayjajargenjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		Jajargenjang jg = new Jajargenjang();

		Jajargenjang[] jajar = new Jajargenjang[5];

		for (int i = 0 ; i < jajar.length ; i++) {
			jajar[i] = new Jajargenjang();

			System.out.println("JajarGenjang ke-" + (i+1));
			System.out.print("Masukkan panjang alas ke-" + (i+1) + " : ");
			jajar[i].panjang = input.nextInt();
			System.out.print("Masukkan tinggi ke-" + (i+1) + " : ");
			jajar[i].tinggi = input.nextInt();
			System.out.print("Masukkan panjang Sisi Miring ke-" + (i+1) + " : ");
			jajar[i].sisiMiring = input.nextInt();

			System.out.println("\n");

		}

		for (int i = 0; i < jajar.length ; i++) {
			System.out.println("\nJajarGenjang ke-" + (i+1));
			System.out.println("Luas = " + jg.hitungLuas(jajar[i].panjang , jajar[i].tinggi));
			System.out.println("Keliling = " + jg.hitungKeliling(jajar[i].panjang , jajar[i].sisiMiring));
		}


    }
    
}
