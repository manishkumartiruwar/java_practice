/*
Diagonal Difference

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal 1+5+9= 15. The right to left diagonal = 3+5+9= 17.
Their absolute difference is|15- 17 | = 2.

Function description

Complete the  diagonalDifference function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference
Input Format

The first line contains a single integer, n , the number of rows and columns in
the square matrix arr .
Each of the next n lines describes a row, arr[i], and consists of n space-separated
integers  arr[i][j].

Constraints
-100 <= arr[i][j] <=100
Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a
single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x
*/

import java.util.Scanner;
public class Diagonal_Difference{
public static void main (String args[]){
Scanner Object = new Scanner(System.in);
int b= 0;
int N  = 0 ;
N=Object.nextInt();
int a[][] = new  int[N][N];
int SumFirstDiagonal =0 ;
int SumSecondDiagonal =0;   
int difference= 0;
int absoluteDifference = 0 ;


for ( int j=0; j < N; j++){
 for ( int k=0; k < N; k++){
    b = Object.nextInt();
if ( b > -101 && b < 101){ a[j][k] = b ;}
else    {a[j][k] = 0;} 
 }}
for ( int l = 0 ; l < N ;l ++){
   SumFirstDiagonal = SumFirstDiagonal+a[l][l];
}
for ( int m = N-1 ; m > -1 ;m--){
   SumSecondDiagonal= SumSecondDiagonal+a[m][m];
}     
difference = SumFirstDiagonal - SumSecondDiagonal;

absoluteDifference = Math.abs(difference); // used to take absolute value of difference
System.out.println(absoluteDifference);
}
}
// taking note of maths class.
