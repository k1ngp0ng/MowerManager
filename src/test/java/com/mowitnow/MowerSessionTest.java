package com.mowitnow;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scapillier on 13/07/16.
 */
public class MowerSessionTest {

    private Field field;
    private MowerSession mowerSession;

    @Before
    public final void setUp() {
        field = new Field(5,5);
        mowerSession= new MowerSession();

        Position initialPositionMower1 = new Position(1,2, Direction.NORTH);
        Instructions instructionMower1 = new Instructions("GAGAGAGAA");
        Mower mower1 = new Mower(field, initialPositionMower1, instructionMower1);
        mowerSession.addMower(mower1);

        Position initialPositionMower2 = new Position(3,3, Direction.EAST);
        Instructions instructionMower2 = new Instructions("AADAADADDA");
        Mower mower2 = new Mower(field, initialPositionMower2, instructionMower2);
        mowerSession.addMower(mower2);

    }

    @Test
    public final void launch_xebia_test_case() {
        Position expectedPositionMower1 = new Position(1,3, Direction.NORTH);
        Position expectedPositionMower2 = new Position(5,1, Direction.EAST);
        mowerSession.launchSession();

        assertEquals(expectedPositionMower1, mowerSession.getMower(0).getCurrentPosition());
        assertEquals(expectedPositionMower2, mowerSession.getMower(1).getCurrentPosition());
    }
}
