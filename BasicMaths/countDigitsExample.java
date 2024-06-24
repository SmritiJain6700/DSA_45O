package BasicMaths;

import java.util.Scanner;

public class countDigitsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int cnt = countDigitsBruteForce(x);
        System.out.printf("%d\n",cnt);

        int cnt1 = countDigitsOptimal(x);
        System.out.printf("%d",cnt1);

        sc.close();
    }

    public static int countDigitsBruteForce(int x){
        // time-complexity = O(logN+1)
        // space-complexity = O(1)
        int num = x;
        int cnt = 0;
        while(num != 0){
            cnt += 1;
            num = num/10;
        }
        return cnt;
    }

    public static int countDigitsOptimal(int x){
        return (int)(Math.log10(x) + 1);
    }
}

