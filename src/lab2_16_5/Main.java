package lab2_16_5;

/**
 * Created by R2-D2 on 23.03.2016.
 */
public class Main {
    static void foo(int i){
        System.out.println("int");
    }
    static void foo(byte b){
        System.out.println("byte");
    }

    public static void main(String[] args) {
        byte b = 5;
        foo(b);  // will be output "byte" because wee put byte variable into method
        foo(5); // output "int" because 5 is literal, so it's a int by default
    }
}
