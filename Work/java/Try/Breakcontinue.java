public class Breakcontinue {
    public static void main(String[] array) {
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0)
                    break;
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}

