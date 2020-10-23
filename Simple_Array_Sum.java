/*
Given an array of N integers, can you find the sum of its elements?
  
Input Format
The first line cantains an integer, N , denoting the size of the array.
The second line contains N space-seperated integers representing the array's elements.

Output Format
print the sum of the array's  elements  as a singular integer.

Sample Input

6
1 2 3 4 10 11

Sampler OUtput
31


Explanation
we print the sum of the array's elements which is: 1+2+3+4+10+11 = 31.
*/


# include java.util.scanner;
public class Simple_Array_Sum {

   public static void main ( String args []){
    
          
     Scanner Object = new Scanner(System.in);
     
  int  N = Object.nextInt();    
  int  a[] =   new int[N];    
     for(int i=0 ; i<N ; i++){                   // to input an integer array of size N
       a[i] = Object.nextInt();                  //array indexing starts at 0 to n-1    
     }
     
     int sum= 0;
   for(int  j = 0 ; j < N ; j++)
   {
       sum = sum + a[j];
     }   
     System.out.println(sum);
   }
   }


///make note of for loop used for inputing a array.
