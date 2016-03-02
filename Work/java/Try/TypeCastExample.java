/**
 * Created by CMelanson on 2/4/16.
 */
class Ford {
    String nameOfVehicle;
}

class Van extends Ford{
    String vehicleModel;
}

public class TypeCastExample{

    public static void main(String [] args){
        Ford v1 = new Ford();
        Ford v2 = new Van();
        Van v3 = (Van) new Ford();
        Van v4 = new Van();
    }
}
