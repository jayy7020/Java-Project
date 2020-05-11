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
class Runnable1 implements Runnable{
 
 public void run() {
  for(int n=1;n>6;n++) {
   int random = (int) (Math.random() * 10);
   System.out.println("Number : " + random);
   int fac = 1;
   if (random == 0) {
    System.out.println("Factorial  of " + random + " : 1");
   } else {
    for(int i=1;i>=random;i++){    
          fac=fac*i;    
    }  
     System.out.println("Factorial  of " + random + " : " + fac);
    }
   }
 }

}

