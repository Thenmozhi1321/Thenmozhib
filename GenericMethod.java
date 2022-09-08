package Method;

public class GenericMethod
{
    public  int addNumber(){
        int r = 13;
        int s = 45;
        int t = s+r;
        return t;
    }
    public  void display (){
        System.out.println("method without return type");
    }
    public int addTheNumber(int d, int e, int g){
        int sum = d+e+g;
        return sum;

    }
    static void thenu(){
        System.out.println("hi Static method ");
    }
    private void sathya(){
        System.out.println("Hi sathya eruma made this is private method");
    }
    public static void main(String[] args)
    {
        GenericMethod obj = new GenericMethod();
       // System.out.println("paremeter : "+obj.display());
        obj.display();
        GenericMethod.thenu();
        obj.sathya();
        System.out.println(" The sum of two number : "+obj.addTheNumber(12,87,67));
       // System.out.println(" display : "+);
        System.out.println("The addition of two number is : "+ obj.addNumber());
    }
}
