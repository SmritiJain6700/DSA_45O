package ThingstoknowinJava;
public class functionPassByRefrence {
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.value = 10;
        System.out.println("Before the method call:"+obj.value);
        modifyValue(obj);
        System.out.println("After the method call:"+obj.value);
    }

    public static void modifyValue(MyObject obj){
        obj.value = 20;
    }
}

class MyObject{
    int value;
}
