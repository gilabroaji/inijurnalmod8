/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonacci {

   public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        System.out.print("User tolong masukan Jumlah Deret Fibonacci = ");
        int n = show.nextInt();
        long fib[] = new long[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
     int sum=0;
// Initialize some variables
    int current, prev = 1, prevprev = 0;
// Loop exactly 10 times 
    for(int i = 0; i < 10; i++)          
    {
// Next number is sum of previous two 
      current = prev + prevprev;        
      System.out.println(current + " ");// Print it out
       sum+=current;
// First previous becomes 2nd previous 
      prevprev = prev;
// And current number becomes previous                  
      prev = current;                   
    }
// Terminate the line, and flush output 
    System.out.println();               
    System.out.print("Result= " + sum);
  }
}
