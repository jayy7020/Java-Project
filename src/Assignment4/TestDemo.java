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
public class TestDemo
{
	
	public static void main(String[] args) 
{
CreditCardPayment x = new CreditCardPayment(33, "Jay","02/22", "************555");

		CashPayment p = new CashPayment(55);

		x.paymentDetails();
		p.paymentDetails();
	}
}

