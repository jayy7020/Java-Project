/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author JAY YADAV
 */
public class Test {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        t.start();
        t2.start();
    }
}

