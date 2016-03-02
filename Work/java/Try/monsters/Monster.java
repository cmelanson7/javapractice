package monsters;

/**
 * Created by CMelanson on 3/1/16.
 */


public class Monster { //base class, super class, or parent class
    public double hitPoints;
    public double speed;

    public void attack()
    {
        System.out.println("I am attacking from Monster class.");
    }

    public void test()
    {
        System.out.println("This is your test in MONSTER.");
    }

    public Monster(){
        System.out.println("I'm DEFAULT constructor from Monster class.");
    }

    public Monster(double hitPoints, double speed)
    {
        this.hitPoints = hitPoints;
        this.speed = speed;
        System.out.println("I'm constructor from Monster with class with 2 arguments.");
    }
}

