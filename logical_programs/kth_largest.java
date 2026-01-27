// Q) Find kth largest number in an array

package logical_programs;

public class kth_largest {
    public static void main(String[] args) {

        // Given array
        int arr[] = {1, 3, 5, 2, 4, 8, 7, 6};

        // k value
        int k = 3;

        int max = 0, index = 0;              // To store index of max value

        // Outer loop runs k times
        for (int i = 1; i <= k; i++) {

            max = arr[0]; // Reset max for each iteration

            // Inner loop to find largest element
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }

            // Remove the found largest element
            arr[index] = Integer.MIN_VALUE;
        }

        // After k iterations, max contains kth largest element
        System.out.println("Kth largest element is: " + max);
    }
}
