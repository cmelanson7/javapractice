/**
 * Created by CMelanson on 2/25/16.
 */
public class LoopTest {
    public static void main(String[] args) {
        for (int a = 1; a<= 4; a++){
            for (char x = 'a'; x <= 'c'; x++){
                System.out.println(" " + a + x);
                break;
            }
        }
    }
}