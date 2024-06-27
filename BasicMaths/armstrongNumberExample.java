// time-complexity = O(log10N+1)
// space-complexity = O(1)
package BasicMaths;

import java.util.Scanner;

public class armstrongNumberExample {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            boolean isArmstrong = checkIfArmstrong(x);
            if(isArmstrong){
                System.out.println("Number is Armstrong Number");
            }
            else{
                System.out.println("Number is not an Armstrong Number");
            }
            sc.close();
    }

    public static boolean checkIfArmstrong(int x){
        int num = x;
        int k = String.valueOf(num).length();
        int summ = 0;
        while(num != 0){
            int digit  = num%10;
            summ += Math.pow(digit, k);
            num = num/10;
        }
        if(summ == x){
            return true;
        }
        else{
            return false;
        }
    }
}
