package lab2_16_3;

/**
 * Created by R2-D2 on 23.03.2016.
 */
public class Main {
    static void foo(int a, int b){
        System.out.println(a+" "+b);
    }
    static void foo(int... a){
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        foo(2,3);
        foo(1,2,5);
    }
}
