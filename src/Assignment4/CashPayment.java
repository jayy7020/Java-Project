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
public class CashPayment extends Payment
{
	CashPayment(double val) 
	{
		super(val);
	}

	public void paymentDetails()
	{
		System.out.println("The payment of cash:  $" + this.cash);
	}
}

