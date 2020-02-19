package com.mowitnow;

/**
 * Created by scapillier on 13/07/16.
 */
public class Mower {

    private Field field;
    private Position initialPosition;
    private Position currentPosition;
    private Instructions instructions;

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public Mower(Field field, Position initialPosition, Instructions instructions) {
        this.field = field;
        this.initialPosition = initialPosition;
        this.instructions = instructions;
    }

    /**
     * Exécute la séquence d'instructions initialisée au préalable
     * @return
     */
    public Position move() {
        // A chaque lancement on considère que la tondeuse repart de sa position initiale
        this.currentPosition = initialPosition;
        Position newPosition;
        for (Action action : instructions.getActions()) {
            System.out.println(String.format("Executing action '%s'", action.getLibelle()));
            newPosition = currentPosition.executeAction(action);
            if (field.isInsideField(newPosition)) {
                currentPosition = newPosition;
            }
            else {
                System.out.println(String.format("Action '%s' cannot be executed because the result is out of field with position %s", action, newPosition));
            }
        }
        return currentPosition;
    }


}
