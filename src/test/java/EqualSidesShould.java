import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualSidesShould {
    @Test
    public void find_index_0_when_array_has_one_element() {
        assertThat(EqualSides.findEvenIndex(new int[] {0})).isEqualTo(0);
    }

    @Test
    public void not_find_index_when_array_has_two_different_elements() {
        assertThat(EqualSides.findEvenIndex(new int[] {0, 1})).isEqualTo(-1);
    }

    @Test
    public void find_index_when_array_has_two_elements_and_the_last_is_zero() {
        assertThat(EqualSides.findEvenIndex(new int[] {0, 0})).isEqualTo(0);
    }

    @Test
    public void not_find_index_when_array_has_three_elements_and_dont_has_equals_sizes() {
        assertThat(EqualSides.findEvenIndex(new int[] {0, 0, -1})).isEqualTo(-1);
    }

    private static class EqualSides {
        public static int findEvenIndex(int[] elements) {
            if (hasOnlyOne(elements)) return 0;
            if (elements[1] == 0) return 0;
            return -1;
        }

        private static boolean hasOnlyOne(int[] elements) {
            return elements.length == 1;
        }
    }
}
