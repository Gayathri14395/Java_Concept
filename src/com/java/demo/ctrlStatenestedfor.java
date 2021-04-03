package com.java.demo;

public class ctrlStatenestedfor {
	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++) //1
		  {
			for(int j=1;j<=3;j++)
			{
				System.out.print(i+" ");
		
	}
		System.out.println();
}
		System.out.println();
		
		for(int i=3;i>=1;i--)//2
		{
			for(int j=3;j>=1;j--)
			{
				System.out.print(i+" ");
		}
		System.out.println();
		}
		
		System.out.println();
		
			
		for(int i=3;i>=1;i--)//3
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(j+" ");
		}
		System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=3;i++)//4
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(j+" ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=3;i++)//5
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int i=3;i>=1;i--)//6
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=3;i++) //7
		  {
			for(int j=1;j<=3;j++)
			{
				System.out.print(j+" ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int i=3;i>=1;i--)//8
		
		  {
			for(int j=3;j>=1;j--)
			{
				System.out.print(j+" ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= 3; i++) //Task 7
		{ 
			for (int j = i + 1; j <= 3; j++) 
			
		{
			System.out.println(j+" ");
}
} 
		System.out.println();
		
		for (int i = 1; i <= 3; i++) //Task 8
		{ 
			
			for (int j = i + 1; j <= i; j++) 
			{
			System.out.println(j);
	}
			}
		}
	}