/**
 * Created by CMelanson on 2/2/16.
 */
class If_Statement {
    public static void main(String args[])
    {
        int num1 = 10;
        int num2 = 20;

        if  ((++num1 > 0) || (++num2 > 0))
        {
            System.out.println(num1);
            System.out.println(num2);
        }

    }
}

//Switch

class SwitchDate {
    public static void main(String [] ars){
        int week = 3;

        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedneday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}

// && will check if both left and right conditions are true
// || condition will check if either side is true (if left is true it skips the right