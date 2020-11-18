package strings;

public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        System.out.println("get character at position");
        char ch = sb.charAt( 0 );
        System.out.println(ch);

        System.out.println("Update character ");
        sb.setCharAt( 0,'d' );
        System.out.println(sb);

        System.out.println("Insert  Character");
        sb.insert( 2,'y' );
        System.out.println(sb);

        System.out.println("Remove the Character");
        sb.deleteCharAt( 2 );
        System.out.println(sb);

        System.out.println("Append Character");
        sb.append( 'g' );
        System.out.println(sb);

        System.out.println("Length of Character");
        System.out.println(sb.length());

        checkDuration();

    }

    private static void checkDuration(){
        int n = 1000000; // when we use StringBuilder -- works till 10 pow 7
        //int n = 10000; // when we use String
        long start = System.currentTimeMillis();
        //This take so long time to run
        /*String s = "";
        for(int i=0;i<n;i++){
            s += i;
        }*/

        //That's why we go for String Builder to improve performance
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append( i );
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);

    }
}
