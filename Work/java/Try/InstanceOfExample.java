/**
 * Created by CMelanson on 2/10/16.
 */

class Vehicle1 {

    String name;
    Vehicle1() {
        name = "Vehicle1";
    }
}

class HeavyVehicle1 extends Vehicle1 {

    HeavyVehicle1(){
        name = "HeavyVehicle1";
    }
}

class Truck1 extends HeavyVehicle1 {

    Truck1() {
        name = "Truck1";
    }
}

class LightVehicle1 extends Vehicle1 {

    LightVehicle1() {
        name = "LightVehicle1";
    }
}

public class InstanceOfExample{

    static boolean result;
    static HeavyVehicle1 hV = new HeavyVehicle1();
    static Truck1 T = new Truck1();
    static HeavyVehicle1 hv2 = null;
    public static void main(String [] args){
        result = hV instanceof HeavyVehicle1;
        System.out.println("hV is an HeavyVehicle: " + result + "\n");
        result = T instanceof HeavyVehicle1;
        System.out.println("T is an HeavyVehicle: " + result + "\n");
        result = hV instanceof Truck1;
        System.out.println("hV is a Truck: " + result + "\n");
        result = hv2 instanceof HeavyVehicle1;
        System.out.println("hv2 is an HeavyVehicle: " + result + "\n");
    }
}