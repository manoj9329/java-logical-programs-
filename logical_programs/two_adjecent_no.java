//Q) from an arrya find two adjecent no whose sum is 30 and return their indexes


package logical_programs;

public class two_adjecent_no {
    public static void main(String[] args) {
        
        int arr[] = {10, 12, 18, 6, 4};

        for(int i=0; i<arr.length-1; i++){
            if (arr[i] + arr[i + 1] == 30) {
                System.out.println("The indexes are : " + i + " " +(i + 1));

                
            }
        }
    }
    
}
