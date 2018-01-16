package com.mowitnow;

public class Position {

	private Integer x;
	private Integer y;
	private Direction direction;

	public Integer getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}

	public Integer getX() {
		return x;
	}

	public Position(Integer x, Integer y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	private Position moveForward() {
		switch (direction) {
			case NORTH:
				return new Position(getX(), getY() + 1, Direction.NORTH);
			case SOUTH:
				return new Position(getX(), getY() - 1, Direction.SOUTH);
			case EAST:
				return new Position(getX() + 1, getY(), Direction.EAST);
			case WEST:
				return new Position(getX() - 1, getY(), Direction.WEST);
			default:
				throw new IllegalArgumentException("Unknown direction " + direction);
		}
	}

	public Position executeAction(Action action) {
		switch (action) {
			case D:
				return new Position(getX(), getY(), getDirection().turnRight());
			case G:
				return new Position(getX(), getY(), getDirection().turnLeft());
			case A:
				return moveForward();
			default:
				throw new IllegalActionException(action);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Position position = (Position) o;

		if (x != null ? !x.equals(position.x) : position.x != null) return false;
		if (y != null ? !y.equals(position.y) : position.y != null) return false;
		return direction == position.direction;

	}

	@Override
	public int hashCode() {
		int result = x != null ? x.hashCode() : 0;
		result = 31 * result + (y != null ? y.hashCode() : 0);
		result = 31 * result + (direction != null ? direction.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format("[x=%s, X=%s, direction=%s]", x, y, direction);
	}

}