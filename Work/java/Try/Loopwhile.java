class Loopwhile{
    public static void main(String[] args){
        int a = 1;
        while(a < 10)
            System.out.println("number count:" + a++);
    }
}

class LoopWhile2 {
    public static void main(String [] args){
        int b = 10;

        while(b < 100){
            System.out.println("Count is:" + b);
            b += 10;
        }

    }
}

class NoBody {
    public static void main(String args[]) {
        int i, j;

        i = 10;
        j = 20;

        while(i < j);  // no body in this loop
        {
        System.out.println("Out of the Loop");
        }

    }
}

//Do While loops
class DoWhile {
    public static void main(String [] args){
        int number = 5;
        do {
            System.out.println("This is a countdown from 5 using a do while loop.");
            number--;
        }
            while(number > 0);
    }
}