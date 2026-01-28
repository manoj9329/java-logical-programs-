package logical_programs;
public class reverse_String_array {
    public void reverse_String(char[] s){
        int i = 0;
        int j = s.length-1;

        while (i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        reverse_String_array obj = new reverse_String_array();

        char[] arr = {'h','e','l','l','o'};
        obj.reverse_String(arr);

        // printing reversed array
        for (char c : arr) {
            System.out.print(c + " ");
    }

    
}}
