package oops;
/**
 *
 * @author SAI
 */
public class Overloading {
    public static void method()
    {
        System.out.println("No argument method");
             
    }
    public static void method(int x)
    {
        System.out.println("int type argument method");
             
    }
    public static void method(double x)
    {
        System.out.println("Double argument method");
             
    }
    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.method();
        o.method(10.5);
        o.method(10);
        
    }
}
