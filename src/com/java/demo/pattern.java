package com.java.demo;

public class pattern {
	public static void printNums(int n) 
    { 
        int i, j,num; 
    
        for(i=0; i<n; i++) // outer loop for rows
        { 
            num=1; 
            for(j=0; j<=i; j++) // inner loop for rows
            { 
                // printing num with a space  
                System.out.print(num+""); 
    
                //incrementing value of num 
                num++; 
            } 
    
            // ending line after each row 
            System.out.println(); 
        } 
    } 
       public static void main(String args[]) 
    { 
        int n = 3; 
        printNums(n); 
    } 

}
