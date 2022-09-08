package java8.methodref;
//method refernce to an instance method of an arbitary object of a particular type

import java.util.Arrays;

public class Example
{
    public static void main(String[] args) {
        String[] Strarr = {"thenu","Balu", "Murali","manju"};
        /*
         * methoad refwrnce to an instance method of an arbitary object of a particular type
         */
        Arrays.sort(Strarr,String::compareToIgnoreCase);
                for(String data:Strarr){
            System.out.println(data);
        }
    }
}
