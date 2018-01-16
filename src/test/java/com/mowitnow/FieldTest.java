package com.mowitnow;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scapillier on 13/07/16.
 */
public class FieldTest {

    private Integer MAX_HEIGHT = 4;
    private Integer MAX_LENGTH = 5;
    private Field field;

    @Before
    public void setUp() {
        field = new Field(MAX_LENGTH,MAX_HEIGHT);
    }

    @Test(expected = IllegalArgumentException.class)
    public final void test_field_constructor_with_invalid_argument() {
        field = new Field(null, 5);
    }

    @Test
    public final void test_position_is_inside_field() {
        Position position = new Position(0,0, Direction.NORTH);
        assertEquals(true, field.isInsideField(position));

        position = new Position(MAX_LENGTH, MAX_HEIGHT, Direction.SOUTH);
        assertEquals(true, field.isInsideField(position));

        position = new Position(3,3, Direction.NORTH);
        assertEquals(true, field.isInsideField(position));

    }

    @Test
    public final void test_position_is_ouside_field() {
        Position position = new Position(MAX_LENGTH+1,MAX_HEIGHT, Direction.NORTH);
        assertEquals(false, field.isInsideField(position));

        position = new Position(MAX_LENGTH, MAX_HEIGHT+1, Direction.SOUTH);
        assertEquals(false, field.isInsideField(position));

        position = new Position(-1,1, Direction.SOUTH);
        assertEquals(false, field.isInsideField(position));

        position = new Position(1,-1, Direction.SOUTH);
        assertEquals(false, field.isInsideField(position));


    }

}
