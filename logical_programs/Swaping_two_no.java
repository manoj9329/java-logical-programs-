package logical_programs;

import java.util.Scanner;

public class Swaping_two_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
        
    }
}