/**
 * Created by CMelanson on 2/1/16.
 */
public class Refer {

    public static void main(String[] args){
        int a = 10;

        Test test = new Test();

        test.changeValue(a);

        System.out.println(a);
    }
}

class Test
{
    void changeValue(int var)
    {
        var = var + 5;
    }

}
