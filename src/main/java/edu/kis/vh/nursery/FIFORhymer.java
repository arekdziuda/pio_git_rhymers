package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            TEMP.countIn(super.countOut());

        int ret = TEMP.countOut();

        while (!callCheck())

            countIn(TEMP.countOut());

        return ret;
    }
}
