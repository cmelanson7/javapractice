/**
 * Created by CMelanson on 2/2/16.
 */
class Demer {
    double length;
    double breadth;

    void setLength(int len)
    {
        length = len;
    }
}

class RectangleDemo {
    public static void main(String args[]) {

        Demer r1 = new Demer();

        r1.length = 10;
        System.out.println("Before Function Length : " + r1.length);

        r1.setLength(20);
        System.out.println("After Function Length : " + r1.length);

    }
}

class FirstProgram {
    public static void main(String[] args) {

        String myName = "PRASHAN";
        System.out.println("Hello " + myName);

        myName = "PRABHU";
        System.out.println("Hello " + myName);
    }
}