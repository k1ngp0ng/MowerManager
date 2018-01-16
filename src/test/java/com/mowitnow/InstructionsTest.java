package com.mowitnow;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by scapillier on 13/07/16.
 */
public class InstructionsTest {

    @Test
    public final void test_constructor_with_good_string() {
        List<Action> expectedActions = Arrays.asList(Action.A, Action.G, Action.D, Action.D, Action.G);
        Instructions instructions = new Instructions("AGDDG");
        assertEquals(5, instructions.getActions().size());
        for (int i=0; i< expectedActions.size(); i++) {
            assertEquals(expectedActions.get(i), instructions.getActions().get(i));
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public final void test_constructor_with_empty_string() {
        Instructions instructions = new Instructions("");
    }

    @Test(expected = IllegalArgumentException.class)
    public final void test_constructor_with_bad_string() {
        Instructions instructions = new Instructions("EEE");
    }
}
