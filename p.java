
package myproject;


public class p extends o {
    int a=10,b=25, c=20;
    p()
    { System.out.println("Inside  P constructor");
    }
    //overridding
    void show1()
    {
        super.show1();
        System.out.println("Hello from p ");
    }
    int func1(int x, int y)
    {
    return x*y;
    }
}
