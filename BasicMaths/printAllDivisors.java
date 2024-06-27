// time-complexity - O(sqrt(n)) + O(nlogn) = O(nlogn)
// space-complexity - O(n)
package BasicMaths;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class printAllDivisors {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    List<Integer> array = printDivisors(num);
    System.out.println("Output");
    for(Integer x:array){
        System.out.println(x);
    }
    sc.close();
}
 public static List<Integer> printDivisors(int num){
    List<Integer> arrayList = new ArrayList<>();

    // O(sqrt(n))
    for(int i=1; i<=Math.sqrt(num);i++){
        if(num % i == 0){
            arrayList.add(i);
            if(num/i != i){
                arrayList.add(num/i);
            }
        }
    }
    // O(nlogn)
    Collections.sort(arrayList);
    return arrayList;
 }
}
