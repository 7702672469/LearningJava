import java.util.Locale;

public class StringExamplw {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Good Morning");
        s.insert(1,"Friend");
        System.out.println(s.toString());
    }
}
