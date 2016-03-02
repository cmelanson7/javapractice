public class Breaktry{
    public static void main(String[] args){
        for(int x = 2; x <= 20; x++)
        {
            if (x % 2 == 0)
                continue; // STOP EXECUTION OF CURRENT ITERATION BUT CONTINUE
            System.out.println(x);
        }
    }
}

//break used when someone clicks and wants to stop loop