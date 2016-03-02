/**
 * Created by CMelanson on 2/2/16.
 */
class Looper {
    public static void main(String [] args) {
        for (int i = 3; i <= 10; i++) {
            System.out.println("This");
        }
        System.out.println("Again");
    }
}


class Looper2{
    public static void main(String[] args){
        boolean exp = true; // causes infinite loop because expression is always evaled to true
        for(int i=1; exp ; i++){
            System.out.println("Count is : " + i);
        }
    }
}