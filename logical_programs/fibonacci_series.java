package logical_programs;

public class fibonacci_series {;
    public static void main(String[] args) {

        int n = 10; // how much numbers of fibonacci series we want
        int first_number = 0;
        int second_number = 1;
        int nextnum;

        for (int i = 1; i <=n; i++) {
            System.out.print(first_number + " , ");
            nextnum = first_number + second_number;
            first_number = second_number;
            second_number = nextnum;


            
        }






    }
    
}
