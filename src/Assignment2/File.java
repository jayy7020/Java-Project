/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author JAY YADAV
 */
public class File extends Document 
{

	private String pathname;

	public File(String textMsg, String pathDes) 
	{
		super(textMsg);
		pathname = pathDes;
	}

	public String getPathname()
	{
		return pathname;
	}

	public String getText() 
	{
		return super.toString();
	}

	public void setPathname(String newPath)
	{
		pathname = newPath;
	}

	public String toString() 
	{
		return pathname + ": " + super.toString();
	}

	public static boolean ContainsKeyword(Document docObject, String keyword)
	{
		if (docObject.toString().indexOf(keyword, 0) >= 0)
			return true;

		return false;
	}

	public static void main(String args[]) 
	{
		String sam_A = "The boys where very happy" + " also they were excited.";
		String sam_B = "The people need to follow rules " + "else they shall break law.";
		Document email1 = new Email(sam_A, "Jay", "Mary", "Ram");
		Document email2 = new Email(sam_B, "John", "Lucy", "Shyam");

		Document file1 = new File(sam_A, "Ram.txt");
		Document file2 = new File(sam_B, "Shyam.txt");
		String testWord = "Rose";
		if (ContainsKeyword(email1, testWord))
			System.out.println("Email 1 contains the word " + testWord);
		else
			System.out.println("Email 1 does not contain " + "the word " + testWord);
		if (ContainsKeyword(email2, testWord))
			System.out.println("Email 2 contains the word " + testWord);
		else
			System.out.println("Email 2 does not contain" + " the word " + testWord);
		if (ContainsKeyword(file1, testWord))
			System.out.println("File 1 contains the word " + testWord);
		else
			System.out.println("File 1 does not contain" + " the word " + testWord);
		if (ContainsKeyword(file2, testWord))
			System.out.println("File 2 contains the word " + testWord);
		else
			System.out.println("File 2 does not contain" + " the word " + testWord);
		System.out.println("---");
		System.out.println(email1.toString());
		System.out.println("---");
		System.out.println(email2.toString());
		System.out.println("---");
		System.out.println(file1.toString());
		System.out.println(file2.toString());

	}
}

