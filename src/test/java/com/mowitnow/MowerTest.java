package com.mowitnow;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scapillier on 13/07/16.
 */
public class MowerTest {

    private Field field;

    @Before
    public final void setUp() {
        field = new Field(5,5);
    }

    @Test
    public final void testMoveOk() {
        Position initialPositionMower1 = new Position(1,2, Direction.NORTH);
        Instructions instructionMower1 = new Instructions("GGA");
        Mower mower1 = new Mower(field, initialPositionMower1, instructionMower1);
        Position finalPositionMower1 = mower1.move();
        Position expectedPositionMower1 = new Position(1,1, Direction.SOUTH);
        assertEquals(expectedPositionMower1, finalPositionMower1);
    }

    @Test
    public final void testMoveKo() {
        // Teste qu'on ne dépasse pas les limties du terrain
        Position bottomLeftCornerInSouth = new Position(0,0, Direction.SOUTH);
        Instructions moveAboveFieldLimits = new Instructions("AADAAA");
        Mower mower1 = new Mower(field, bottomLeftCornerInSouth, moveAboveFieldLimits);
        Position finalPositionMower = mower1.move();
        Position expectedPositionMower = new Position(0,0, Direction.WEST);
        assertEquals(expectedPositionMower, finalPositionMower);
    }
}
