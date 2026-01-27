package logical_programs;

import java.util.Scanner;

//count the vowels 

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentance : ");
        String str = sc.nextLine();
        int vowel = 0;
        int consonent = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
    
        if (ch == 'a'|| ch == 'e'|| ch == 'o' || ch == 'u') {
            vowel ++;
        }
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
            {
                consonent++;

            
        }
    }
    System.out.println("Vowels is : " + vowel);
    System.out.println("Consonents is : " + consonent);
        
        
    }
    
}
