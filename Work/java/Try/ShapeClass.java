/**
 * Created by CMelanson on 2/4/16.
 */
public class ShapeClass {
    int SHAPE_SIDES = 3; //if marked as final error on line 12

    void setShape(){
        SHAPE_SIDES = 4;
    }

    public static void main(String[] args){
        ShapeClass c1 = new ShapeClass(); //error here when SHAPE_SIDES marked final
        c1.setShape();
    }
}
