package com.amazon.ata.unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtaAdditionTest {
    @Test
    public void add_singleInteger_returnsTheInteger() {
        // GIVEN
        int[] oneInteger = {42};
        AtaAddition ataAddition = new AtaAddition();

        // WHEN
        int result = ataAddition.add(oneInteger);

        // THEN
        Assertions.assertEquals(42, result, "Expected adding a single int to return the int");
    }

    @Test
    public void add_twoIntegers_returnsTheirSum() {
        // GIVEN
        int[] tuple = {6, 9};
        AtaAddition ataAddition = new AtaAddition();

        // WHEN
        int result = ataAddition.add(tuple);

        // THEN
        Assertions.assertEquals(15, result,
                                "Expected adding two ints (6,9) to return their sum (15)");
    }

    @Test
    public void add_emptyArray_returnsZero() {
        // GIVEN
        int[] emptyArray = {};
        AtaAddition ataAddition = new AtaAddition();

        // WHEN
        int result = ataAddition.add(emptyArray);

        // THEN
        Assertions.assertEquals(0, result, "Expected empty array to sum to zero");
    }

    @Test
    public void add_nullArray_returnsZero() {
        // GIVEN
        int[] nullArray = null;
        AtaAddition ataAddition = new AtaAddition();

        // WHEN
        int result = ataAddition.add(nullArray);

        // THEN
        Assertions.assertEquals(0, result, "Expected null array to sum to zero");
    }

    @Test
    /**
     * This test assumes that adding enough values will result in a sum
     * greater than {@code Integer.MAX_VALUE}.
     *
     * When an assumption is found to be incorrect, we must update our test
     * logic and names.
     */
    public void add_sumOutOfBounds_resultsInValueLargerThanMAX_VALUE() {
        // GIVEN
        int[] values = {Integer.MAX_VALUE - 5, 3, 3};
        AtaAddition ataAddition = new AtaAddition();

        // WHEN
        int result = ataAddition.add(values);

        // THEN
        Assertions.assertTrue(result > Integer.MAX_VALUE - 5,
                              "Expected summing above MAX_VALUE to result in value above MAX_VALUE");
    }

}
