package com.bombardier.macs.util.temp.forme.csv;

/**
 * Interface for a customer (for bean reading/writing tests).
 * 
 * @author James Bassett
 */
public interface Customer {
	
	public String getCustomerNo();
	
	public void setCustomerNo(String customerNo);
	
	public long getLoyaltyPoints();
	
	public void setLoyaltyPoints(long loyaltyPoints);
	
	public String getMailingAddress();
	
	public void setMailingAddress(String mailingAddress);
	
}