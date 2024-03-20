package com.amazon.ata.unittesting;

/**
 * A utility providing math operations (for now, just adding integers).
 */
public class AtaAddition {

    /**
     * Compute the sum of the integers in the array argument, throwing an
     * <code>ArithmeticException</code> if the sum overflows or
     * underflows MAX_INTEGER/MIN_INTEGER.
     *
     * @param integers The array of ints for which to compute the sum
     * @return The sum of the integers in <code>integers</code>.
     * @see ArithmeticException <p> An alternate implementation that checks for overflow would be: <pre>{@code
     * Long longSum = 0L;
     * for (int x : integers) {
     * longSum = longSum + x;
     *
     * // throw ArithmeticException on overflow/underflow of running sum
     * if (longSum > Integer.MAX_VALUE) {
     * throw new ArithmeticException("Sum overflowed int");
     * } else if (longSum < Integer.MIN_VALUE) {
     * throw new ArithmeticException("Sum underflowed int");
     * }
     * }
     *
     * return longSum.intValue();
     * }</pre>
     */
    public int add(int[] integers) {
        if (null == integers) {
            return 0;
        }

        Long longSum = 0L;
        for (int x : integers) {
            longSum = longSum + x;

            // throw ArithmeticException on overflow/underflow of running sum
            if (longSum > Integer.MAX_VALUE) {
                throw new ArithmeticException("Sum overflowed Integer");
            } else if (longSum < Integer.MIN_VALUE) {
                throw new ArithmeticException("Sum underflowed Integer");
            }
        }

        return longSum.intValue();
    }}