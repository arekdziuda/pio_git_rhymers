package edu.kis.vh.nursery.list;

public class IntArrayStack {

    private static final int NUMBER_ARRAY_SIZE_ELEMENTS_COUNT = 12;
    private static int[] NUMBERS = new int[NUMBER_ARRAY_SIZE_ELEMENTS_COUNT];
    private static final int INITIAL_VALUE = -1;
    private static final int EMPTY_VALUE = -1;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        IntArrayStack.total = total;
    }

    private static int total = INITIAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public static boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == NUMBER_ARRAY_SIZE_ELEMENTS_COUNT-1;
    }

    public static int peekaboo() {
        if (callCheck())
            return EMPTY_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;
        return NUMBERS[total--];
    }

}
