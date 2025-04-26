public class MinimumElementIndex {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Minimum element is " + min + " at index " + minIndex);
    }
}