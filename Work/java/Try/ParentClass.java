/**
 * Created by CMelanson on 2/3/16.
 */
public class ParentClass {
    int ageClass = 100;

    public void show() {
        System.out.println("ageClass Parent Class:" + ageClass);
    }

    public static void main(String [] args) {
        ChildClass c1 = new ChildClass();
        c1.display();

        ParentClass p1 = new ParentClass();
        p1.show();
    }
}

class ChildClass extends ParentClass{
    int ageClass = 200;

    public void display(){
        System.out.println("ageClass: " + ageClass);
    }
}
