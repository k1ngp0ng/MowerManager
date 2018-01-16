package com.mowitnow;

/**
 * Représente les actions unitaires possibles que l'on peut envoyer à une tondeuse
 */
public enum Action {

	D("turn right"), G("turn left"), A("move forward");
	
	private final String libelle;
	
	public String getLibelle() {
		return libelle;
	}

	Action(String libelle) {
		this.libelle = libelle;
	}
}
