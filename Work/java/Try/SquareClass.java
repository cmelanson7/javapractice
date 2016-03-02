/**
 * Created by CMelanson on 2/4/16.
 */
public class SquareClass { // if marked as final error on line 17
    int SHAPE_SIDES = 3;

    void setShape(){ // if this is set to final there is a compile error on line 19
        SHAPE_SIDES = 4;
    }

    public static void main(String [] args){
        SquareClass c1 = new SquareClass();
        c1.setShape();
    }
}

class Circle extends SquareClass{

    void setShape(){ // error here
        SHAPE_SIDES = 4;
    }
}
