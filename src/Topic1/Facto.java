/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic1;

/**
 *
 * @author JAY YADAV
 */
public class Facto {
    public static void main(String[] args) {
        factorial(12);
    }
        public static int factorial(int n) {
        final int val;
        if (n == 0) { val = 1; }
        else { val = n * factorial(n - 1); }
        System.out.println(val);
        return val;
    }
}

