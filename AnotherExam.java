package java8.methodref;

import java.lang.reflect.Constructor;

interface MyInterface{
    Hello display(String say);
}
class Hello{
    Hello(String say) {
        System.out.println("Good Morning pangu!"+ say);

    }
}
public class AnotherExam
{
    public static void main(String[] args) {
        MyInterface ref = Hello::new;
        ref.display(" How are you  pangu");

    }
}
