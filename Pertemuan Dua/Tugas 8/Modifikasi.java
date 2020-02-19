/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifikasi;

import java.util.Scanner;

/**
 *
 * @author Navis
 */
public class Modifikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		Modif ls = new Modif();
		ls.control = 0;

		System.out.print("Masukkan jumlah tanah : ");
		ls.jumlah = input.nextInt();
		
		Modif[] tanah = new Modif[ls.jumlah];

		for (int i = 0; i < tanah.length ; i++) {
			tanah[i] = new Modif();

			System.out.print("\nMasukkan panjang Tanah ke-" + (i+1) + " : ");
			tanah[i].panjang = input.nextInt();
			System.out.print("Masukkan lebar Tanah ke-" + (i+1) + " : ");
			tanah[i].lebar = input.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tanah.length ; i++) {
			System.out.println("Luas Tanah ke-" + (i+1) + " : " + ls.luasTanah(tanah[i].panjang , tanah[i].lebar));
		}

		ls.max = ls.luasTanah(tanah[0].panjang , tanah[0].lebar);

		
 		for (int i = 0; i < tanah.length ; i++) {
 			if (ls.luasTanah(tanah[i].panjang , tanah[i].lebar) > ls.max) {
 				ls.max = ls.luasTanah(tanah[i].panjang , tanah[i].lebar);
 				ls.control = i;
 			}
 		}

 		System.out.println("\nTanah yang terluas adalah tanah ke-" + (ls.control+1));
 		


    }
    
}
