package lqb2_16_4;

/**
 * Created by R2-D2 on 23.03.2016.
 */
public class Main {
    static void foo(Animal a){
        System.out.println("Animal");
    }
    static void foo(Dog d){
        System.out.println("Dog");
    }
    static void foo(Puppy p){
        System.out.println("Puppy");
    }

    public static void main(String[] args) {
        foo(null);
    }
}
