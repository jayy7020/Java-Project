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
public class Email extends Document 
{
	private String sender;
	private String recipient;
	private String title;

	public Email(String textDoc, String senderMsg, String recipientMsg, String titleMsg) 
	{

		super(textDoc);
		sender = senderMsg;
		recipient = recipientMsg;
		title = titleMsg;
	}

	public String getSender()
	{
		return sender;
	}

	public String getRecipient() 
	{
		return recipient;
	}

	public String getTitle() 
	{
		return title;
	}

	public String gettext()
	{
		return super.toString();
	}

	public void setSender(String newSenderMsg)
	{
		sender = newSenderMsg;
	}

	public void setRecipient(String newRecMsg)
	{
		recipient = newRecMsg;
	}

	public void setTitle(String newTitleMsg) 
	{
		title = newTitleMsg;
	}

	public String toString() 
	{
		return "From: " + sender + "\nTo: " + recipient + "\n" + title + "\n\n" + super.toString();

	}
}

