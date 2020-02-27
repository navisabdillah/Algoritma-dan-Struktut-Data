/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbem;

import java.util.Scanner;

/**
 *
 * @author Navis
 */
public class MainBem {

    public static void main(String[] args) {

        Scanner el = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("  Pemilihan Suara Ketua BEM thn 2020  ");
        System.out.println("--------------------------------------");
        Bem bem = new Bem();
        Bem[] b = new Bem[bem.jumlahKandidat];

        for (int i = 0; i < bem.jumlahKandidat; i++) {
            b[i] = new Bem();
            System.out.print("Nama Kandidat ke-" + (i + 1) + " : ");
            b[i].kandidat = el.nextLine();
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < bem.jumlahKandidat; i++) {
            System.out.print("Jumlah Suara kandidat ke -" + (i + 1) + " : ");
            b[i].suara = el.nextInt();
            bem.jumlahSuara += b[i].suara;
        }
        System.out.println("--------------------------------------");
        int hasil = bem.hitung(bem.jumlahSuara, b[0].suara, b[1].suara, b[2].suara, b[3].suara);
        if (hasil == 0) {
            System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
        } else {
            System.out.println("Ketua BEM yang terpilih adalah " + b[hasil - 1].kandidat);
        }
    }

}
