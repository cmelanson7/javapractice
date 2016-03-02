/**
 * Created by CMelanson on 3/1/16.
 */

import monsters.Monster;
import monsters.Skeleton;
import monsters.Zombie;



public class Inheritance {
    public static void main(String[] args) {
        Monster m = new Skeleton();

        m.attack();
        m.test();
//        Zombie z = new Zombie();
//        Skeleton s = new Skeleton();
//
//        Monster m2 = new Zombie();
//        m2 = new Skeleton();
//
//        Inheritance.whatever(new Skeleton());
//    }
//
//    static void whatever(Monster monster){
//

    }
}






//        Monster monster = new Monster(100, 10);
//
//        monster.attack();
//
//        System.out.println(monster.hitPoints);
//        System.out.println(monster.speed);
//
//        Skeleton skeleton = new Skeleton(1000, 20);
//        Skeleton skeleton2 = new Skeleton(1500, 500, "Bow");
//        System.out.println(skeleton.hitPoints);
//        System.out.println(skeleton2.speed);
//        skeleton.attack();

//        Skeleton skeleton = new Skeleton(111, 2222);
//        System.out.println(skeleton.hitPoints);
//        System.out.println(skeleton.speed);
//        skeleton.attack("Cross Bow");
//
//    }
//}
