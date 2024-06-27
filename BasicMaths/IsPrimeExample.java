// time-complexity - O(sqrt(n)) 
// space-complexity - O(n)
package BasicMaths;

import java.util.Scanner;

public class IsPrimeExample {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    isPrime(num);
    sc.close();
}
 public static void isPrime(int num){
    int cnt = 0;

    // O(sqrt(n))
    for(int i=1; i<=Math.sqrt(num);i++){
        if(num % i == 0){
            cnt += 1;
            if(num/i != i){
                cnt += 1;
            }
        }
    }
    if(cnt == 2){
        System.out.println("Prime");
    }
    else
        {
            System.out.println("Not Prime");
        }
 }
}
