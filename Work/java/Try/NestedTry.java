/**
 * Created by CMelanson on 2/3/16.
 */
public class NestedTry {
    public static void main(String argv[]){

        int num1 = 10;
        int num2 = 0;
        int result = 0;
        int arr[] = new int[5];

        try {
            try {
                arr[5] = 5;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Err: Array Out of Bound");
            }

            try {
                result = num1 / num2;
            } catch (ArithmeticException e) {
                System.out.println("Err: Divide by Zero");
            }
            System.out.println("Result of Division: " + result);

        }catch (Exception e) {
            System.out.println("Exception Occurred!");
        }
    }
}

class MyExceptional {
    public static void main(String[] args){

        try {
            int i = 10 / 0;
        } catch (Exception ex){
            System.out.println("Inside 1st catch Block");
        }

        try{
            int i = 10/10;
        } catch(Exception ex){
            System.out.println("Inside second catch block");
        }finally {
            System.out.println("inside 2nd finally block");
        }
    }
}

class StudentException{

    static void validateMarks(int marks){
        if (marks < 75)
            throw new ArithmeticException("reappear for the exam");
        else
            System.out.println("Student is having Distinction");
}

    public static void main(String args[]){
    validateMarks(71);
    System.out.println("Remaining code...");
}
}

class ExceptionPropagation{

    void method3(){
        int result = 100 / 0; //Exception here
    }

    void method2(){
        method3();
    }

    void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception is handled here");
        }
    }

        public static void main(String [] args){
            ExceptionPropagation obj=new ExceptionPropagation();
            obj.method1();
            System.out.println("Continue with Normal Flow...");
    }
}

class ExceptionPropagation2{

    void method3(){
        //throw new java.io.IOException("Checked Exception..");
    }

    void method2(){
        method3();
    }

    void method1(){
        try{
            method2();
        } catch(Exception e){ //exception methods ARE not propagated in the chain -- causes compiler error
            System.out.println("Exception is handled here");
        }
    }

    public static void main(String args[]){
        ExceptionPropagation obj=new ExceptionPropagation();
        obj.method1();
        System.out.println("Continue with Normal Flow...");
    }
}