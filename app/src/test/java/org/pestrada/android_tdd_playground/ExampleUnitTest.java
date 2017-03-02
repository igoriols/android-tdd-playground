package org.pestrada.android_tdd_playground;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    @Test
    public void additionShouldBeCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void divisionShouldBeCorrect() {
        assertEquals(2, 8 / 4);
    }

    @Test
    public void multiplicationShouldBeCorrect() {
        assertEquals(4, 2 * 2);
    }

}