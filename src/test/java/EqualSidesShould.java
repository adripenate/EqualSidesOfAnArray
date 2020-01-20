import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualSidesShould {
    @Test
    public void find_index_0_when_array_has_one_element() {
        assertThat(EqualSides.findEvenIndex(new int[] {0})).isEqualTo(0);
    }

    private static class EqualSides {
        public static int findEvenIndex(int[] elements) {
            return 0;
        }
    }
}
