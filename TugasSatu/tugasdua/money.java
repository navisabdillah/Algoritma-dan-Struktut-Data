/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdua;

/**
 *
 * @author ROG STRIX
 */
public class money {
    public static void main(String[] args){
        int bulan = 0;
        double money = 1000000, bunga = 0.02;
        System.out.printf("Saldo tabungan Anda Sekarang : Rp %,.2f" ,money);
        for(bulan = 0; money<1500000; bulan++){
            money += money * bunga;
        }
        System.out.println("");
        System.out.printf("Dalam Waktu  \t: %d Bulan\nUang Anda \t: Rp %,.2f\n" ,bulan, money);
    }
}
