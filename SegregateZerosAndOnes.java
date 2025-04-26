public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Increment left index if the element is 0
            if (arr[left] == 0) {
                left++;
            } 
            // Decrement right index if the element is 1
            else if (arr[right] == 1) {
                right--;
            } 
            // Swap if left is 1 and right is 0
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print the segregated array
        System.out.print("Segregated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}