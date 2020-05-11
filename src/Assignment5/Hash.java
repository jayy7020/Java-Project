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
import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Jay");
		set.add("Ram");
		set.add("shyam");
		set.add("Koro");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}

