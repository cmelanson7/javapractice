package monsters;

/**
 * Created by CMelanson on 3/1/16.
 */
public class Zombie extends Monster {
    String typeOfAttack;
    public Zombie() {
        System.out.println("I am your default zombie class constructor.");
    }

    public Zombie(double hitPoints, double speed) {
        super(hitPoints, speed);
        System.out.println("This is the 2 double constructor from Zombie class.");
    }

    public Zombie(double hitPoints, double speed, String typeOfAttack) {
        super(hitPoints, speed);
        System.out.println("I am constructor from skeleton class with three arguments.");
        this.typeOfAttack = typeOfAttack;
    }
}



