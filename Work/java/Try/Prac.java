/**
 * Created by CMelanson on 2/2/16.
 */
public class Prac {
    int length;
    int breadth;

    Prac()
    {
        length = 20;
        breadth = 12;
    }

    void setDiamentions(int ln,int br)
    {
        length  = ln;
        breadth = br;
    }
}

class Practice {
    public static void main(String args[]) {

        Prac r1 = new Prac();

        System.out.println("Length of Rectangle : " + r1.length);
        System.out.println("Breadth of Rectangle : " + r1.breadth);

        r1.setDiamentions(40,50);

        System.out.println("Breadth of Rectangle : " + r1.breadth);
        System.out.println("Length of Rectangle : " + r1.length);


    }
}
