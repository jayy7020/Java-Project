/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author JAY YADAV
 */
public class TestLibrary
{
    public static void main(String args[])
      {     
        Magazine magazine1 = new Magazine ("ISBN1112", "Ayup Magazine",99, "Comic");
        magazine1.getIsbn();
        magazine1.getTitle();
        magazine1.getPrice();
        magazine1.getType();
        System.out.println();

        
        Novel  Novel1 = new Novel ("ISBN13332","Avenger",979, "Jay");
        Novel1.getIsbn();
        Novel1.getTitle();
        Novel1.getPrice();
        Novel1.getAuthor();
        System.out.println();        
      }
}

