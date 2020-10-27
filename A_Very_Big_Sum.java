/*
A very big sum
In this challenge, you are required to calculate and print the sum of the elements 
in an array, keeping in mind that some of those integers may be quite large.

Function Description

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):
int ar[n]: an array of integers .


Return
long: the sum of all array elements


Input Format
The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.

Output Format
Return the integer sum of the elements in the array.

Constraints
1<=n<=10
0<= ar[i} <= 10^10
 
Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005

Output
5000000015

Note:

The range of the 32-bit integer is .
When we add several integer values, the resulting sum might exceed the above range. 
You might need to use long int C/C++/Java to store such sums.

*/
import java.util.Scanner;
public class A_Very_Big_Sum {

	public static void main ( String args [] ){

		Scanner Object1 = new Scanner(System.in);
		 int N=0;
		 int n=0;
		
		 long Sum = 0;
		 int b=0;
		 
		 N= Object1.nextInt();
		 
		 if ( 0< N && N< 11) { n= N; }
		 else {n =10;}
		 int a[]= new int [n];
		 
		 
		 
		 for (int j = 0 ; j<n; j++){
		     b = Object1.nextInt();
		        if (b > 0   && b < 1000000000){
		            a [j] = b  ; }
		         else { a[j] = 0 ; }
		        }
		 
		 
		 for (int K =0 ; K<n; K++){
		     Sum = Sum +  a [K];
		     }

		  
		  System.out.println( Sum);
		 }
		}

