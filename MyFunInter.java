package java8FunInter;

import java.util.function.IntBinaryOperator;

//create our own functional interface
interface inter{
    //single abstract method
    public int addMethod(int a,int b);
}
public class MyFunInter
{
    public static void main(String[] args) {
        //lambda operation
        inter sum = (a,b)-> a+b;
        System.out.println("result = "+sum.addMethod(12,100));
        //predinfined function interface
        //lamda expression
        IntBinaryOperator add = (a,b)-> a+b;
        System.out.println("Result = "+add.applyAsInt(12,100));

    }
}
