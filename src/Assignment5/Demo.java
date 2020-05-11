/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

/**
 *
 * @author JAY YADAV
 */
class Demo
{
    public static void main(String[] args)
    {
        
        String str = " How was your day today";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in string is = "+count);
    }
}

