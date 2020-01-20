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

    private static class EqualSides {
        public static int findEvenIndex(int[] elements) {
            return 0;
        }
    }
}
