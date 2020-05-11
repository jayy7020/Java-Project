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
public class Document 
{
	private String text;

	public Document(String textDoc)
	{
		setText(textDoc);
	}
	public void setText(String newTextDoc) 
	{
		text = newTextDoc;
	}
	public String toString()
	{
		return text;
	}
}

