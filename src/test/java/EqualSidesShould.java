import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

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

    @Test
    public void find_index_when_array_has_three_elements_and_has_equals_sizes() {
        assertThat(EqualSides.findEvenIndex(new int[] {-1, 0, -1})).isEqualTo(1);
    }

    private static class EqualSides {
        public static int findEvenIndex(int[] elements) {
            if (hasOnlyOne(elements)) return 0;
            for (int position = 0; position<elements.length-1; position++){
                int[] rightSize = getRightSizeOf(elements, position);
                int[] leftSize = Arrays.copyOfRange(elements, 0, position);
                int sumElements = getSumOfElements(rightSize);
                int sumLeftElements = getSumOfElements(leftSize);
                if (sumElements == sumLeftElements) return position;
            }
            return -1;
        }

        private static int getSumOfElements(int[] rightSize) {
            return Arrays.stream(rightSize).sum();
        }

        private static int[] getRightSizeOf(int[] elements, int position) {
            return Arrays.copyOfRange(elements, position+1, elements.length);
        }

        private static boolean hasOnlyOne(int[] elements) {
            return elements.length == 1;
        }
    }
}
