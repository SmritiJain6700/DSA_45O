package ThingstoknowinJava;
public class functionPassByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before the method call:"+x);
        modifyValue(x);
        System.out.println("After the method call:" + x);
    }

    public static void modifyValue(int x){
        x = 20;
    }
}
