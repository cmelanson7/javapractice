/**
 * Created by CMelanson on 2/2/16.
 */

class PostIncrement {
    public static void main(String args[]) {
        int num1 = 1;
        int num2 = 1;
        int i = 0;

        num1++;
        num2 = num2++;
        i = i++;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(i);
    }
}

class PreIncrement {
    public static void main(String args[]) {
        int num1 = 1;
        int num2 = 1;
        int x = 1;

        --num1;
        --num2;
        x = --x;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println(x);
    }
}

class P_Increment {
    public static void main(String args[]) {
        int num1;
        int num2;
        int num3;

        num1 = 100;
        num2 = ++num1;
        num3 = num2++ + ++num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }
}

class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;

        // prints 4
        System.out.println(i);
        ++i;

        // prints 5
        System.out.println(i);

        // prints 6
        System.out.println(++i);

        // prints 6
        System.out.println(i++);

        // prints 7
        System.out.println(i);
    }
}

class IncDec {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a--;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}