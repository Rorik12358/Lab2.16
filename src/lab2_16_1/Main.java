package lab2_16_1;

/**
 * Created by R2-D2 on 22.03.2016.
 */
public class Main {
    static void foo(Dog d){
        System.out.println("Dog");
    }
    static void foo(Animal a){
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        foo(a);
    }
}
