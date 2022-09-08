package java8.methodref;

import java.lang.reflect.Method;
import java.util.function.BiFunction;

public class Student
{
    /*
     * Method reference is the short hand notation of lambda expression to call  a method
     * str->System.out.println(str);
     * System.out::println
     */
interface myInterface{
    public void display();
}
// make the reference to the abstract method and instacne methoad
    //method reference to an instance method of an object - object::instance method
    class Addtion{
    static int add(int n1, int n2){
        return n1+n2;
    }
}
public  void myMethod(){
    System.out.println("Instance method");

}

    public static void main(String[] args) {
        Student obj = new Student();
        myInterface ref = obj::myMethod;
        ref.display();
        //addtion instance = new addtion();
        BiFunction<Integer,Integer,Integer > addition = Addtion::add;
        int sum = addition.apply(45,3);
        System.out.println("Addtion of two no is : "+sum);
}
}
