
// time complexity = O(n)
// space complexity = O(n) -- recursive stack space
// print n to 1 with recursion when n is given
package Recursion;

import java.util.Scanner;

public class printNto1usingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
        sc.close();
    }      
      public static void printNos(int N)
        {
            //Your code here
            printN(N,N);
            
        }
        
        public static void printN(int i, int N){
            if(i <= 0){
                return;
            }
            System.out.print(i+" ");
            printN(i-1,N);
        }    
        
    } 
    
