// Time complexity: O(2N), There are two possibilities for every disk. Therefore, 2 * 2 * 2 * . . . * 2(N times) is 2N
// Auxiliary Space: O(N), Function call stack space
package Recursion;

public class towerOfHanoi {
    public static void towerOfHanoii(int n,int s,int d,int h){
        if(n == 1)
        { 
            System.out.println("Move the disk " + n + " from " + s + " to "+ d  );
            return;
        }
        towerOfHanoii(n-1, s, h, d);
        System.out.println("Move the disk "+n+" from " + s + " to "+ d
         );
        towerOfHanoii(n-1, h, d, s);
    }
    public static void main(String[] args){
        int no_of_plates = 3;
        int s = 1;
        int h = 2;
        int d = 3;
        towerOfHanoii(no_of_plates,s,d,h);

    }
}
