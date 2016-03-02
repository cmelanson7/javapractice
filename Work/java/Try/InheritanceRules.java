/**
 * Created by CMelanson on 2/3/16.
 */
public class InheritanceRules {

    public int calculate(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String [] args){
        baseClass b1 = new baseClass();
        int result = b1.calculate(10, 10);
        System.out.println("Result: " + result);

        InheritanceRules n1 = new InheritanceRules();
        int sum = n1.calculate(12, 12);
        System.out.println("This is the first class: " + sum);
    }
}

class baseClass extends InheritanceRules{

    public int calculate(int num1, int num2){
        return num1 * num2;
    }
}
