/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BruteForce;

// Nama     : Muhammad Navis Abdillah  
// Kelas    : TI 1F
// Nim      : 1941720147
public class Soal1Main {

    private static void match(char[] text, char[] pattern) {

        int x;
        int cek = 0;
        for (int i = 0; i <= text.length - pattern.length; i++) {
            x = 0;
            while (x < pattern.length && text[i + x] == pattern[x]) {
                x++;
            }
            if (x >= pattern.length) {
                cek++;
            }
        }
        if (cek > 0) {
            System.out.println("DATA COCOK");
        } else {
            System.out.println("DATA TIDAK COCOK");
        }
    }

    public static void main(String[] args) {
        char[] x = {'N', 'G', 'A'};
        char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
        match(y, x);
    }
}
