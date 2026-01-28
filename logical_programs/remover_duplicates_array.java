package logical_programs;
// to remove an duplicate element from an array
import java.util.Arrays;
import java.util.LinkedHashSet;

public class remover_duplicates_array {

    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 2, 5, 6, 5};

        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set);





    }
}