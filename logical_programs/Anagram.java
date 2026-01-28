package logical_programs;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "LISTEN";
        String s2 = "SILENT";

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        if (c1.length != c2.length) {
            System.out.println("They are not anagram");
            return;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}

