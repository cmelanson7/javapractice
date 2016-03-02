/**
 * Created by CMelanson on 2/3/16.
 */

public class Truck extends Automobile {

    public void truckMethod(){
        System.out.println("Method " + "in Truck." );
    }

    public static void main(String [] args){
        Truck myTruck = new Truck();
        Automobile myAutomobile = new Automobile();

        myAutomobile.automobileMethod();
        myTruck.truckMethod();

    }
}
