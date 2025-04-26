public class MaximumElementIndex {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 35};
        
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Maximum element is " + max + " at index " + maxIndex);
    }
}