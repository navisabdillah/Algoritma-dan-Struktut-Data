/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugaslima;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class Menghitung {
 static Scanner sc = new Scanner(System.in);   

    public static void main(String[] args) {
        
        System.out.println("1. Menghitung Luas Segitiga");
        System.out.println("2. Menghitung Luas Segiempat");
        System.out.println("3. Menghitung Luas Lingkaran");
        System.out.println("Pilih Menu : ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                Segitiga();
                break;
            case 2:
                Segiempat();
            case 3:
                Lingkaran();
                break;
        }
    }
    static void Segitiga() {
        int total;
        System.out.print("Masukkan Alas : ");
        int alas = sc.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int tinggi = sc.nextInt();
        total = (int)(alas*tinggi)/2;
        System.out.println("Total Segitiga adalah " +total);
    }
    static void Segiempat() {
        int total;
        System.out.print("Masukkan Sisi 1 : ");
        int s1 = sc.nextInt();
        System.out.print("Masukkan Sisi 2 : ");
        int s2 = sc.nextInt();
        total = (int)(s1*s2);
        System.out.println("Total Segiempat adalah " +total);
}
    static void Lingkaran() {
        double total, phi=3.14;
        System.out.print("Masukkan Jari-Jari : ");
        int jari2 = sc.nextInt();
        total = (phi*(jari2*jari2));
        System.out.println("Total Segitiga adalah " +total);
}
}
