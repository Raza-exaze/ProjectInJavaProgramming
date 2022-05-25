package com.example.LamdaFunction;

interface Lamda
{
	public void check();
}
public class App 
{
    public static void main( String[] args )
    {
    	Lamda lam=new Lamda() 
    	{
    		public void check()
    		{
    			System.out.print("Hello");
    		}
    	};
    	lam.check();
    }
}
