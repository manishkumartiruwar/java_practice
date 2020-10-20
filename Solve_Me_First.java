/*

 complete the function Solve_Me_First to compute the sum of two integers.
 
 
 Function prototype:
 int Solve_Me_First(int x, int y);
 where.
 .x is the first integer input.
 .y nis the second ingeger input.
 
 Return values
 .sum of the above two integers
 
 Sample Input
 x=2
 y=3
 
 Sample Output
 5
 
 Explanation
 The sum of the two integers X and y is computed as : 2 + 3 =5.
 */
 
 
 #include java.util.Scanner;
 public class Solve_Me_First{
         public static void main ( String args []){
         
         Scanner  sc = new Scanner(System.in) ;
        int a ;
              a = sc.nextInt() ;
        int b;
              b = sc.nextInt() ;
        int sum ;
             sum = Solve_Me_First(a, b) ;
        System.out.println(sum) ;
 }
 }
 public class int Solve_Me_First(int x, int y){
       int sum = 0 ;
        sum  =  a + b  ;
      return sum ;
 }
         // make note of seeing scanner class in java documentation.
