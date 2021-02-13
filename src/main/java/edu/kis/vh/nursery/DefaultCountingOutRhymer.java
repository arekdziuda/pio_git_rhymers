package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack = new IntArrayStack();

    public static boolean callCheck() {
        return IntArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }


    public static int peekaboo() {
        return IntArrayStack.peekaboo();
    }


    public DefaultCountingOutRhymer() {

    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void setTotal(int total) {
        intArrayStack.setTotal(total);
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}
