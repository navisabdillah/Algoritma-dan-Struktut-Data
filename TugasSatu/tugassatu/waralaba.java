/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class waralaba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga=0, jum=0, total=0;
        String ulang = "Ya";
        while (ulang.equalsIgnoreCase("Ya")) {
        System.out.println("1. Paket Chicken");
        System.out.println("2. Paket Oke");
        System.out.print("Masukkan Paket : " );
        int paket = sc.nextInt();
        System.out.println();
        switch (paket) {
            case 1:
                System.out.println("1. Chicken A (Rp. 12.000)");
                System.out.println("2. Chicken B (Rp. 15.000)");
                System.out.println("3. Chicken c (Rp. 20.000)");
                System.out.println();
                System.out.print("Silahkan Pilih : ");
                int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    harga = 12000;
                    break;
                case 2:
                    harga = 15000;
                    break;
                case 3:
                    harga = 20000;
                    break;
                default:
                    System.out.println("MAsukkan Menu Yang Tertera");
                    break;
            }
                break;
            case 2:
                System.out.println("1. Oke A (Rp. 10.000)");
                System.out.println("2. Oke B (Rp. 12.000)");
                System.out.println("3. Oke c (Rp. 15.000)");
                System.out.println();
                System.out.print("Silahkan Pilih : ");
                int menu2 = sc.nextInt();
                switch (menu2) {
                case 1:
                    harga = 10000;
                    break;
                case 2:
                    harga = 12000;
                    break;
                case 3:
                    harga = 15000;
                    break;
                default:
                    System.out.println("MAsukkan Menu Yang Tertera");
                break;
        }
                break;
            default:
                System.out.println("Menu Salah");
                break;
        }
            System.out.print("Berapa Banyak? ");
            jum = sc.nextInt();
        System.out.print("> Apakah Anda Ingin Beli lagi? (Ya/Tidak) : ");
        ulang = sc.next();
        total += harga*jum;
    }
        System.out.println("Total :Rp. "+total);
}

    }
    



