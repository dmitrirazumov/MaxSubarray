import java.util.Arrays;

class MaxSubarray {

    static int[] func(int[] a) {

        int li = 0, ri = 0, currentSum = 0;

        int[] newArray;

        int maxSum = a[0];
        int minSum = 0;

        int start = -1;

        for (int i = 0; i < a.length; i++) {

            currentSum += a[i];
            int k = currentSum - minSum;

            if (k > maxSum) {

                maxSum = k;
                li = start + 1;
                ri = i;
            }

            if (currentSum < 0) {

                minSum = currentSum;
                start = i;
            }


        }

        if (li == ri) {

            newArray = new int[]{a[li]};
            return newArray;

        } else {

            newArray = Arrays.copyOfRange(a, li, ri + 1);
            return newArray;
        }
    }
}
