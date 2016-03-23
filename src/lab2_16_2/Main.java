package lab2_16_2;

/**
 * Created by R2-D2 on 22.03.2016.
 */
public class Main {
    public static void foo(int i){
        System.out.println("int");
    }
    static void foo(Byte b){
        System.out.println("Byte");
    }

    public static void main(String[] args) {
        byte b = 9;
        foo(b);
    }
}
