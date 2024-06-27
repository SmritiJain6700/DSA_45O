package BasicMaths;

import java.util.Scanner;

public class Euclidean_GCD {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int gcd = gcd(num1,num2);
    System.out.printf("%d\n",gcd);
    int euclideanGCD = euclideanGCD(num1,num2);
    System.out.printf("%d",euclideanGCD);
    sc.close();
}

public static int gcd(int num1, int num2){
    // time-complexity = O(min(n1,n2))
    for(int i = Math.min(num1,num2);i>=1;i--){
        if(num1%i == 0 && num2%i == 0){
            return i;
        }
    }
    return 1; //min gcd can be 1
}

public static int euclideanGCD(int num1,int num2){
    // time complexity = O(log(min(n1,n2)))
        int a = num1;
        int b = num2;
        while(a > 0  && b > 0){
            if(a > b) a = a%b;
            else b = b%a;
        }
        if(a == 0) return b;
        else return a;

    }
}