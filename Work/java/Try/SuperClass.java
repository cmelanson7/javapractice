/**
 * Created by CMelanson on 2/3/16.
 */
public class SuperClass {

    public SuperClass()
    {
        System.out.println("Hello Parent");
    }

    public SuperClass(int val){
        System.out.println("Hello Parameter" + val);
    }

    public static void main(String args []){
        NotSuperClass c1 = new NotSuperClass();
    }
}

class NotSuperClass extends SuperClass{

    public NotSuperClass()
    {
        super(5); // if you don't explicitly call super the compiler inserts the call to the default constructor of the base class
        System.out.println("Hello Child");
    }
}
