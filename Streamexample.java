package java8.methodref;

import java.util.ArrayList;
import java.util.List;

public class Streamexample
{
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("t");
        names.add("h");
        names.add("e");
        names.add("n");
        int count = 0;
        for (String e : names){
            if(e.length()<6)
                count++;
        }
        System.out.println("There are : "+ count + " String with length less than 6");
        int n = (int) names .stream().filter(e->e.length()<6).count();
        System.out.println("There are : "+ count + " String with length less than 6");

    }
}
