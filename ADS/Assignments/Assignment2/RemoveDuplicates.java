public class RemoveDuplicates {

    // Function to remove duplicates from a sorted array and return the new length
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Edge case: empty array
        }

        int i = 0; // i is the slow-runner
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // Move the unique element to position i
            }
        }
        return i + 1; // Return the length of the unique elements
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 1, 2};
        int newLength1 = removeDuplicates(arr1);
        System.out.println("New length for arr1: " + newLength1); // Only printing the length

        // Test Case 2
        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};
        int newLength2 = removeDuplicates(arr2);
        System.out.println("New length for arr2: " + newLength2); // Only printing the length
    }
}
