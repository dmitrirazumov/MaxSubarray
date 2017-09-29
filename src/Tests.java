import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Tests {

    @Test
    void test() {

        int[] a = {3, 3, 4, 3};
        int[] b = {20, 0, 2, 5, -50, 3, 4};
        int[] c = {1};

        int[] ra = {3, 3, 4, 3};
        int[] rb = {20, 0, 2, 5};
        int[] rc = {1};

        assertArrayEquals(ra, MaxSubarray.func(a));
        assertArrayEquals(rb, MaxSubarray.func(b));
        assertArrayEquals(rc, MaxSubarray.func(c));
    }
}
