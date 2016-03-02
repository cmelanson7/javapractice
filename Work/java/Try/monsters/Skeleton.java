package monsters;

/**
 * Created by CMelanson on 3/1/16.
 */
public class Skeleton extends Monster //derived class, child class, sub class - extends
{
    String typeOfAttack;
    public void attack(String typeOfAttack){
        System.out.println("I am attack method from skeleton class. Type of attack: "+ typeOfAttack);
    }

    public Skeleton(){
        System.out.println("I am DEFAULT constructor from Skeleton class.");
    }

//    public void test()
//    {
//        System.out.println("This is your test in SKELETON.");
//    }

    public Skeleton(double hitPoints, double speed){
        super(hitPoints, speed);
        System.out.println("I am constructor from skeleton class with two arguments.");
        typeOfAttack = "Axe";
    }

    public Skeleton(double hitPoints, double speed, String typeOfAttack){
        super(hitPoints, speed);
        System.out.println("I am constructor from skeleton class with three arguments.");
        this.typeOfAttack = typeOfAttack;
    }
}
