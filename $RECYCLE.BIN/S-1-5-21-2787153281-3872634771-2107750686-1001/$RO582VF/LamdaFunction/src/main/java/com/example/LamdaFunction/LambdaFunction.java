package com.example.LamdaFunction;

interface Move
{
	public void check();
}
public class LambdaFunction 
{
    public static void main( String[] args )
    {
    	Move lam= ()->{System.out.print("Hello");
    	System.out.print("Java");
    	};
    	lam.check();

    	}

}
