package com.mowitnow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DirectionTest {

	@Test
	public void test_move_left() {
		Direction turnLeft = Direction.NORTH.turnLeft();
		assertEquals(Direction.WEST, turnLeft);

		turnLeft = Direction.SOUTH.turnLeft();
		assertEquals(Direction.EAST, turnLeft);

		turnLeft = Direction.EAST.turnLeft();
		assertEquals(Direction.NORTH, turnLeft);

		turnLeft = Direction.WEST.turnLeft();
		assertEquals(Direction.SOUTH, turnLeft);
	}

	@Test
	public void test_move_right() {
		Direction turnRight = Direction.NORTH.turnRight();
		assertEquals(Direction.EAST, turnRight);

		turnRight = Direction.SOUTH.turnRight();
		assertEquals(Direction.WEST, turnRight);

		turnRight = Direction.EAST.turnRight();
		assertEquals(Direction.SOUTH, turnRight);
	}

}
