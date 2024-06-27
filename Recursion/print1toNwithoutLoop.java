// time complexity = O(n)
// space complexity = O(n) -- recursive stack space
// print 1 to n with recursion when n is given
package Recursion;

import java.util.Scanner;

public class print1toNwithoutLoop {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
        sc.close();
    }      
      public static void printNos(int N)
        {
            //Your code here
            int i = 1;
            printN(i,N);
            
        }
        
        public static void printN(int i, int N){
            if(i > N){
                return;
            }
            System.out.print(i+" ");
            printN(i+1,N);
        }    
    }
    