/**
 * Created by CMelanson on 2/2/16.
 */
class cont {
    public static void main(String [] args){
        String str = "wwwwwwjkhfafhaoifgehgohohqbqbqikvqyqvvyuvuwyvwuyvwuyvwuwiuwuwyvwuyvwruwyrvuwyrv234242351wwww";

        int max = str.length();
        int count = 0;

        for (int i = 0; i < max; i++) {

            if (str.charAt(i) != 'w')
                continue;

            count++;
        }

        System.out.println("Counting W : " + count );
    }
}
