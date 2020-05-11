/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

/**
 *
 * @author JAY YADAV
 */
import java.util.HashMap;
import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
  HashMap <String,String> TelephoneBook = new HashMap <String,String>();
  
  TelephoneBook.put("Jay", "992232378");
  TelephoneBook.put("Ram", "810827363");
  TelephoneBook.put("Shyam", "955290499");
  TelephoneBook.put("Sita", "9323054475");
  TelephoneBook.put("Lucky", "863647754");
  
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Name=");
  String name=sc.next().toUpperCase();
  
  if(TelephoneBook.containsKey(name)) {
   System.out.println(name +"= "+TelephoneBook.get(name));
  }
 }
}


