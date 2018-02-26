package com.bombardier.macs.util.temp.forme;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String totos="abc";
		String toton="123";
		otherMethod(111111111,totos);
		otherMethod(111111111,toton);
		
		
	}

static void otherMethod( int mNumber, String value){
	


	try

	{

	       Integer a=Integer.parseInt(value); //use your variable or object in place of obj

	       System.out.println(a + " is a integer number.");

	}

	catch (NumberFormatException e)

	{

	       System.out.println(" is not a integer number.");
		
	}
	
	

	
}


}
