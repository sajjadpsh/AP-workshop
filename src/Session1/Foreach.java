package Session1;

public class Foreach {
    public static void main(String[] args) {
        String myStr = args[0];
        for (char s : myStr.toCharArray()) {
            System.out.println(s);
        }
    }
}
