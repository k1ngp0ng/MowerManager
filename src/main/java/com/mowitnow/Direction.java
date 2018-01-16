package com.mowitnow;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum contenant les 4 points cardinaux ainsi que leur position sur le cercle "triginométrique", 
 * le Nord en haut donc à 0 degré ou 0 modulo 360
 * l'Est à droite donc à 90 degrés ou 90 modulo 360
 * le sud en bas donc à 180 degrés ou 180 modulo 360
 * l'Ouest à gauche donc à 270 degrés ou 270 modulo 360
 * 
 * @author scapillier
 *
 */
public enum Direction {

	NORTH(0), SOUTH(180), EAST(90), WEST(270);
	
	// Angle en degré
	private final Integer angle;
	private static final Map<Integer, Direction> lookUpMap = new HashMap<Integer, Direction>();
	// Angle de rotation en degré
	private static final Integer turnAngle = 90;
	
	static
	{
		for (Direction direction : Direction.values()) {
			lookUpMap.put(direction.getAngle(), direction);
		}
	}

	public Integer getAngle() {
		return angle;
	}
	
	Direction(Integer angle) {
		this.angle = angle;
	}

	/**
	 * On tourne dans le sens inverse des aiguilles d'une montre
	 * @return
	 */
	public Direction turnLeft() {
		Integer newAngle = (angle - turnAngle + 360) % 360;
		return lookUpMap.get(newAngle);
	}
	
	/**
	 * On tourne dans le sens des aiguilles d'une montre
	 * @return
	 */
	public Direction turnRight() {
		Integer newAngle = (angle + turnAngle) % 360;
		return lookUpMap.get(newAngle);
	}
	
}
