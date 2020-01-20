import java.util.Arrays;

class EqualSides {
    public static int findEvenIndex(int[] elements) {
        if (hasOnlyOne(elements)) return 0;
        for (int position = 0; position<elements.length; position++){
            int sumOfRightElements = getSumOfElementsFrom(elements, position+1, elements.length);
            int sumOfLeftElements = getSumOfElementsFrom(elements, 0, position);
            if (sumOfRightElements == sumOfLeftElements) return position;
        }
        return -1;
    }

    private static int getSumOfElementsFrom(int[] elements, int startPosition, int endPosition) {
        int[] leftSize = getElementsFrom(elements, startPosition, endPosition);
        return getSumOfElements(leftSize);
    }

    private static int getSumOfElements(int[] rightSize) {
        return Arrays.stream(rightSize).sum();
    }

    private static int[] getElementsFrom(int[] elements, int startPosition, int endPosition) {
        return Arrays.copyOfRange(elements, startPosition, endPosition);
    }

    private static boolean hasOnlyOne(int[] elements) {
        return elements.length == 1;
    }
}
