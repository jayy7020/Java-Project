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
public abstract class Payment 
    {
	protected double cash;
	Payment(double val) 
	{
			this.cash = Math.round(val*100)/100.0;
		}
	public double getcash() 
	{
			return cash;
		}
	public void setcash(double newval) 
	{
			this.cash = newval;
		}
	public void paymentDetails() 
	{
			System.out.println("The payment of cash: $" +this.cash);
		}
    }

