/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideConquer;

// Nama     : Muhammad Navis Abdillah  
// Kelas    : TI 1F
// Nim      : 1941720147
public class Soal2 {

    static void DivideConquer(int n, char dari_tower, char ke_tower, char aux_rod) {
        if (n == 1) {
            System.out.println("Pindah Gelang Dari tower " + dari_tower + " ke tower " + ke_tower);
        return ;    
        }
        DivideConquer(n - 1, dari_tower, aux_rod, ke_tower);
        System.out.println("Pindah Gelang " + n + " Dari Tower " + dari_tower + " Ke tower " + ke_tower);
        DivideConquer(n - 1, aux_rod, ke_tower, dari_tower);
    }

    public static void main(String args[]) {
        int n = 4; // Jumlah gelang 
        DivideConquer(n, 'A', 'C', 'B'); // A, B, C adalah nama tower
    }

}
