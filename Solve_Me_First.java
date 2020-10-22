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
 
 
 #include java.util.Scanner;  //  here we are including  class Scanner of java .



/*The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.
In our example, we will use the nextINT() method,which is used to read a integer  value from the user.....

*/
 public class Solve_Me_First{
         public static void main ( String args []){
         
         Scanner  sc = new Scanner(System.in) ;      /// here we are creating a scanner object .
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


/*
Input Types
Method	Description
nextBoolean() used to input a boolean value from the user
nextByte()	used to input a value from the user
nextDouble()	used to input a value from the user
nextFloat()	used to input a float value from the user
nextInt()	used to input a int value from the user
nextLine()	used to input a String value from the user
nextLong()	used to input a long value from the user
nextShort()	used to input a short value from the user
*/

// CREDITS hackerrank for the question.  
