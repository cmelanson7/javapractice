/**
 * Created by CMelanson on 2/2/16.
 */
class CompoundAssignment {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c = 3;

        a += 1;
        b *= 1;
        c %= 1;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

class CompoundAssignmentDemo{
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c = 3;

        a += b * c;

        System.out.println("a = " + a);
    }
}
