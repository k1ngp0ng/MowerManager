package com.mowitnow;

/**
 * Représentation d'un champ qui symbolise la surface à tondre
 */
public class Field {
	
	// longueur du terrain ,axe des abscisses
	private Integer length;
	// hauteur du terrain, axe des ordonnées
	private Integer height;
	
	public Field(Integer length, Integer height) {
		if (length == null || height == null) {
			throw new IllegalArgumentException("Length or height can't be null");
		}
		this.length= length;
		this.height = height;
	}
	
	public boolean isInsideField(Position position) {
		return (position.getX()>=0 && position.getX() <= length) && (position.getY() >=0 && position.getY() <= height);
	}
	

}
