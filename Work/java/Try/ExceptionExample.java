/**
 * Created by CMelanson on 2/3/16.
 */
public class ExceptionExample {
        public static void main(String[] args) {
            int number1 = 50;
            int number2 = 0;
            int result;
            try {
                result = number1 / number2;
                System.out.println("Result of Division : " + result);
            } catch(ArithmeticException e) {
                System.out.println("Divide by Zero Error");
            }
        }
    }

class Example {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;
        int arr[] = new int[5];

        try {
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 3;
            arr[4] = 4;
            arr[5] = 5;

            result = num1 / num2;
            System.out.println("Result of Division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Err: Divided by Zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Err: Array Out of Bound");
        }
    }
}