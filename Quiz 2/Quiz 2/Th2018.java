/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th2018;

/**
 *
 * @author ASUS
 */
public class Th2018<T> {

    T data;
    Th2018<T> next;

    public Th2018(T data, Th2018<T> next) {
        this.data = data;
        this.next = next;
    }

}
