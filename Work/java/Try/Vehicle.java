/**
 * Created by CMelanson on 2/3/16.
 */
public class Vehicle {
    public static void main(String [] args){

        FourWheeler v1 = new FourWheeler();
        TwoWheeler v2 = new TwoWheeler();
        WagonR v3 = new WagonR();

        System.out.println(v1 instanceof Vehicle); //instanceof keyword is used to check if FourWheeler actually is a Vehicle
        System.out.println(v2 instanceof Vehicle);
        System.out.println(v3 instanceof Vehicle);
        System.out.println(v3 instanceof FourWheeler);
    }
}

class FourWheeler extends Vehicle{}
class TwoWheeler extends Vehicle{}
class WagonR extends FourWheeler{}
