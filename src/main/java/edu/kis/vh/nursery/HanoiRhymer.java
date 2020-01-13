package edu.kis.vh.nursery;

/**
 * Class used in RhymersFactory
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * value to count amount of rejected
     */
    private int totalRejected = 0;

    /**
     * @return the number of rejected
     */
    int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}