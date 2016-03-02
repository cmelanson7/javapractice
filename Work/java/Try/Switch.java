import com.sun.tools.jdi.SocketAttachingConnector;

/**
 * Created by CMelanson on 1/28/16.
 */
public class Switch {

    public static void main(String[] args){

        int a = 5;

        switch(a)
        {
            case 50:
                System.out.println("a is equal to 50");
                break;
            case 100:
                System.out.println("a is equal to 100");
                break;
            case 200:
                System.out.println("a is equal to 200");
                break;
            default:
                System.out.println("not");
        }
    }
}
