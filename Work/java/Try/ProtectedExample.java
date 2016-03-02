/**
 * Created by CMelanson on 2/3/16.
 */
package com.c4learn.inheritance;

public class ProtectedExample {

    public void publicMethod(){
    }

    void privateMethod(){ //remove private and code compiles successfully.
    }

    protected void protectedMethod(){
    }

    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        c1.testMethods();
    }
}

class ChildClass extends ProtectedExample {

    public void testMethods() {
        publicMethod();
        protectedMethod();
        privateMethod();  //Error
    }
}
