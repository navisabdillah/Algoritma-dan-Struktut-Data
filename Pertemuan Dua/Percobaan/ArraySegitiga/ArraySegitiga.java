/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysegitiga;

/**
 *
 * @author Navis
 */
public class ArraySegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[3];
        sgArray[0] = new Segitiga(30, 12);
        sgArray[1] = new Segitiga(40, 15);
        sgArray[2] = new Segitiga(50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + sgArray[i].hitungLuas());

        }
    }

}
