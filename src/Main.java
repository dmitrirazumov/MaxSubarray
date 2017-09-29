import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int a[] = new int[] {20, 2, 0, 5, -50, 4, 3};

        System.out.println("Source array: " + Arrays.toString(a));

        System.out.print("Max subarray: ");
        int[] maxArray = MaxSubarray.func(a);
        System.out.println(Arrays.toString(maxArray));
    }
}
