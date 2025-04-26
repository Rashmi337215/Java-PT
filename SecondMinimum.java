public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum element found.");
        } else {
            System.out.println("The second minimum element is: " + secondMin);
        }
    }
}