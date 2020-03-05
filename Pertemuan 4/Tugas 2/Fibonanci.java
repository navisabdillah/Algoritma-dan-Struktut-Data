/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonanci;

import java.util.Scanner;

/**
 *
 * @author Navis
 */
public class Fibonanci {
 //Algoritma Divide Conquer
    static int fibo(int n){
        if(n==0||n==1){ //0(1)
            return n; //0(1)
        }
        else{
            return(fibo(n-1)+ fibo(n-2)); //0(k^n)=(2^6)
        }
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int i; //0(1)
        int j = 0; //0(1)
        System.out.print("Masukkan bilangan Fibonacci :"); //0(1)
        int n = input.nextInt(); //0(1)
        
        System.out.print("Hasil bilangan Fibonacci : "); //0(1)
        
        System.out.println(""); //0(1)
        for(i = 1; i<=n; i++){ //0(n)->n=6
            System.out.println("Fibonacci ke-" + i + ":"+ fibo(j)); //0(1)
            j++; //0(1)
        }
        System.out.println();
    }
}
    
    

