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
public class Exception1 {

	public static void main(String[] args) throws InvalidAgeException {
		String name = args[0];
		
		int age = Integer.parseInt(args[1]);
		
		if (age < 18 || age >= 60)
			throw new InvalidAgeException();
		
		System.out.println("Name: " + name + " Age: " + age);
	}

}

